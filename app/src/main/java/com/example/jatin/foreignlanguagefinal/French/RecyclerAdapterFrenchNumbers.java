package com.example.jatin.foreignlanguagefinal.French;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.AboutUs;
import com.example.jatin.foreignlanguagefinal.NavigationDrawer.LanguageChooser;
import com.example.jatin.foreignlanguagefinal.R;

import java.io.IOException;

import static android.support.v4.content.ContextCompat.startActivity;

/**
 * Created by Jatin on 23-Apr-18.
 */

public class RecyclerAdapterFrenchNumbers extends RecyclerView.Adapter<RecyclerAdapterFrenchNumbers.MyViewHolder> {

    String[] numbers;
    String[] numberTrans;
    int[] numbersImages;
    ListItemClickListenerNumbers listItemClickListener;
    Context context;


    public interface ListItemClickListenerNumbers
    {
        void onListItemClick(View view, int position) throws IOException;
    }

    public RecyclerAdapterFrenchNumbers() {
    }

    public RecyclerAdapterFrenchNumbers(String[] numbers, String[] numberTrans, int[] numbersImages, ListItemClickListenerNumbers listItemClickListener, Context context) {
        this.numbers = numbers;
        this.numberTrans = numberTrans;
        this.numbersImages = numbersImages;
        this.listItemClickListener = listItemClickListener;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_languages,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtview.setText(numbers[position]);
        holder.txtViewTrans.setText(numberTrans[position]);
        holder.txtview.setBackgroundColor(Color.parseColor("#FFA500"));
        holder.txtViewTrans.setBackgroundColor(Color.parseColor("#FFA500"));

        Glide.with(context)
                .load(numbersImages[position])
                .override(150,180)
                .fitCenter()
                .into(holder.imgView);
    }

    @Override
    public int getItemCount() {
        return numbers.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView imgView;
        TextView txtview;
        TextView txtViewTrans;

        public MyViewHolder(View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imgView);
            txtview = itemView.findViewById(R.id.txtView);
            txtViewTrans = itemView.findViewById(R.id.txtViewTrans);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            try {
                listItemClickListener.onListItemClick(view, getAdapterPosition());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
