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

public class RecyclerAdapterFrenchNumbers extends RecyclerView.Adapter<RecyclerAdapterFrenchNumbers.MyViewHolder> {

    String[] numbers;
    ListItemClickListenerNumbers listItemClickListener;


    public interface ListItemClickListenerNumbers
    {
        void onListItemClick(View view, int position);
    }

    public RecyclerAdapterFrenchNumbers(String[] numbers, ListItemClickListenerNumbers listItemClickListener) {
        this.numbers = numbers;
        this.listItemClickListener = listItemClickListener;
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
    }

    @Override
    public int getItemCount() {
        return numbers.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView imgView;
        TextView txtview;

        public MyViewHolder(View itemView) {
            super(itemView);

            imgView = itemView.findViewById(R.id.imgView);
            txtview = itemView.findViewById(R.id.txtView);
            txtview.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listItemClickListener.onListItemClick(view, getAdapterPosition());
        }
    }


}
