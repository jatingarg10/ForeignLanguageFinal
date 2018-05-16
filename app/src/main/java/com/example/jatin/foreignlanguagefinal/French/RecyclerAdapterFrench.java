package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jatin.foreignlanguagefinal.MainActivity;
import com.example.jatin.foreignlanguagefinal.R;

/**
 * Created by Jatin on 23-Apr-18.
 */

public class RecyclerAdapterFrench extends RecyclerView.Adapter<RecyclerAdapterFrench.MyViewHolder> {

    String[] categories;
    String[] color;
    ListItemClickListener listItemClickListener;


    public interface ListItemClickListener
    {
        void onListItemClick(View view, int position);
    }

    public RecyclerAdapterFrench(String[] categories, String[] color, ListItemClickListener listItemClickListener) {
        this.categories = categories;
        this.color = color;
        this.listItemClickListener = listItemClickListener;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_main,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtview.setText(categories[position]);
        holder.txtview.setBackgroundColor(Color.parseColor(color[position]));
    }

    @Override
    public int getItemCount() {
        return categories.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
        TextView txtview;

        public MyViewHolder(View itemView) {
            super(itemView);

            txtview = itemView.findViewById(R.id.txtViewMain);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listItemClickListener.onListItemClick(view, getAdapterPosition());
        }
    }


}



