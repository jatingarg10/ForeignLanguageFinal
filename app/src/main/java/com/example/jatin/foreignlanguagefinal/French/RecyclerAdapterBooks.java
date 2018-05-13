package com.example.jatin.foreignlanguagefinal.French;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jatin.foreignlanguagefinal.R;

import java.util.zip.Inflater;

/**
 * Created by Jatin on 13-May-18.
 */

public class RecyclerAdapterBooks extends RecyclerView.Adapter<RecyclerAdapterBooks.MyViewHolder> {

    int[] bookImagesFrench;
    String [] booksText;
    ListItemClickListener listItemClickListener;
    Context context;


    public interface ListItemClickListener
    {
        void onListItemClick(View view, int position);
    }

    public RecyclerAdapterBooks(int[] booksImages, String[] booksText, ListItemClickListener listItemClickListener, Context mContext) {
        this.bookImagesFrench = booksImages;
        this.booksText = booksText;
        this.listItemClickListener = listItemClickListener;
        this.context = mContext;

    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_french_books,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Glide.with(context)
                .load(bookImagesFrench[position])
                .centerCrop()
                .into(holder.booksImage);
        holder.booksText.setText(booksText[position]);
    }

    @Override
    public int getItemCount()
    {
        return bookImagesFrench.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView booksImage;
        TextView booksText;

        public MyViewHolder(View itemView) {
            super(itemView);
            booksImage = itemView.findViewById(R.id.frenchBooksImage);
            booksText = itemView.findViewById(R.id.frenchBooksText);
            booksImage.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listItemClickListener.onListItemClick(view,getAdapterPosition());
        }
    }
}
