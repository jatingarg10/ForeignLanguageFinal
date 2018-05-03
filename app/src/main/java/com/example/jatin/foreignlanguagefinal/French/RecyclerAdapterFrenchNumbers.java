package com.example.jatin.foreignlanguagefinal.French;


import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.jatin.foreignlanguagefinal.NavigationDrawer.AboutUs;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.LanguageChooser;
import com.example.jatin.foreignlanguagefinal.R;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Jatin on 23-Apr-18.
 */

public class RecyclerAdapterFrenchNumbers extends RecyclerView.Adapter<RecyclerAdapterFrenchNumbers.ViewHolderFrenchNumbers> {

    String[] data;
    Context mContext;

    public RecyclerAdapterFrenchNumbers(String[] data, Context ctx)
    {
        this.data = data;
        this.mContext = ctx;
    }

    @Override
    public ViewHolderFrenchNumbers onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.activity_french_main_numbers,parent,false);
        return new ViewHolderFrenchNumbers(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderFrenchNumbers holder, int position) {

        String title = data[position];
        holder.txtNumbers.setText(title);

        holder.recyclerMainNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext,FrenchMainNumbers.class));
            }
        });


    }

    @Override
    public int getItemCount()
    {
        return data.length;
    }


    class ViewHolderFrenchNumbers extends RecyclerView.ViewHolder {

        ImageView imgNumbers;
        TextView txtNumbers;
        RelativeLayout recyclerMainNumbers;

        public ViewHolderFrenchNumbers(View itemView) {
            super(itemView);


            imgNumbers =(ImageView) itemView.findViewById(R.id.imgNumbers);
            txtNumbers = (TextView) itemView.findViewById(R.id.txtNumbers);
            recyclerMainNumbers = itemView.findViewById(R.id.recyclerMainNumbers);
        }


    }
}
