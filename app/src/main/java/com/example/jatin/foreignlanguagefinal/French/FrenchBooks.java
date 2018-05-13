package com.example.jatin.foreignlanguagefinal.French;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.webkit.MimeTypeMap;
import android.webkit.URLUtil;
import android.widget.Toast;

import com.example.jatin.foreignlanguagefinal.R;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class FrenchBooks extends AppCompatActivity implements RecyclerAdapterBooks.ListItemClickListener {

    int[] books = {R.drawable.bookfrench,R.drawable.frenchbbook2};
    String[] text = {"Tech French","Basic French Course"};
    RecyclerView recyclerView;
    ProgressDialog pDialog;
    File storageFile;

    public static final int PROGRESS_BAR_TYPE =0;

    public static String file_url1 = "http://www.goyalpublisher.com/downloads/Tech%20French%20teacher%20book.pdf";
    public static String file_url2 = "https://fsi-languages.yojik.eu/languages/FSI/French/Fsi-FrenchBasicCourserevised-Volume1-StudentText.pdf";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_french_books);

        recyclerView = findViewById(R.id.recyclerFrenchBooks);
        RecyclerAdapterBooks recyclerAdapterBooks = new RecyclerAdapterBooks(books,text,this,getApplicationContext());
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.HORIZONTAL));

        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(recyclerAdapterBooks);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    @Override
    public void onListItemClick(View view, int position) {

        switch (position)
        {
            case 0:
                new DownloadFileFromUrl().execute(file_url1);

            case 1:
                new DownloadFileFromUrl().execute(file_url2);

        }
    }


    @Override
    protected Dialog onCreateDialog(int id) {

        switch (id)
        {
            case PROGRESS_BAR_TYPE:
                pDialog = new ProgressDialog(this);
                pDialog.setMessage("Downloading File, Please Wait... ");
                pDialog.setIndeterminate(false);
                pDialog.setMax(100);
                pDialog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
                pDialog.setCancelable(true);
                pDialog.setButton(DialogInterface.BUTTON_NEGATIVE, "Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        DownloadFileFromUrl dffu = new DownloadFileFromUrl ();
                        if (dffu.getStatus() == AsyncTask.Status.RUNNING) {
                            dffu.cancel(true);
                        }
                    }
                });
                pDialog.show();

                return pDialog;

                default:
                    return null;
        }
    }

    class DownloadFileFromUrl extends AsyncTask<String, String, String>
    {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            showDialog(PROGRESS_BAR_TYPE);
        }

        @Override
        protected String doInBackground(String... f_url) {
            int count;
            try
            {
                URL url = new URL(f_url[0]);
                URLConnection connection = url.openConnection();
                connection.connect();

                int lengthOfFile = connection.getContentLength();
                InputStream input= new BufferedInputStream(url.openStream(),81920);

                String fl = "ForeignLanguage";
                String path =  Environment.getExternalStorageDirectory().toString();
                File appDirectory = new File(path + "/" +fl);
                if(!appDirectory.exists())
                {
                    appDirectory.mkdir();
                }

                String fileExtenstion = MimeTypeMap.getFileExtensionFromUrl(file_url1);
                String name = URLUtil.guessFileName(file_url1, null, fileExtenstion);

                storageFile = new File(appDirectory,name);
                OutputStream outputStream = new FileOutputStream(storageFile);

                byte[] data =new byte[1024];
                long total = 0;

                while((count = input.read(data))!= -1)
                {
                    total +=count;
                    publishProgress("" + (int)(total*100/lengthOfFile));
                    outputStream.write(data, 0, count);
                }

                if (isCancelled()) {

                    if (pDialog.isShowing()) {
                        pDialog.dismiss();
                    }
                }

                outputStream.flush();
                outputStream.close();

            }
            catch(Exception e)
            {
                Log.e("Error: ", e.getMessage());
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onProgressUpdate(String... progress) {
            pDialog.setProgress(Integer.parseInt(progress[0]));
        }

        @Override
        protected void onPostExecute(String s) {
            dismissDialog(PROGRESS_BAR_TYPE);

            Toast.makeText(FrenchBooks.this,"File Downloaded at " + storageFile , Toast.LENGTH_LONG).show();

        }
    }
}
