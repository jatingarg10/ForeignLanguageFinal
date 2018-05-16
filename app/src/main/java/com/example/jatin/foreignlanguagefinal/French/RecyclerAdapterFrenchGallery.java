package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.jatin.foreignlanguagefinal.R;

import static android.os.Build.VERSION_CODES.M;

/**
 * Created by Jatin on 15-May-18.
 */

public class RecyclerAdapterFrenchGallery extends RecyclerView.Adapter<RecyclerAdapterFrenchGallery.MyViewHolder>{

    int[] frenchGallery;
    ListItemClickListener listItemClickListener;
    Context context;

    public RecyclerAdapterFrenchGallery(int[] frenchGallery, ListItemClickListener listItemClickListener, Context context) {
        this.frenchGallery = frenchGallery;
        this.listItemClickListener = listItemClickListener;
        this.context = context;
    }

    interface ListItemClickListener
    {
        void onClickListener(View view,int position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_gallery,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context)
                .load(frenchGallery[position])
                .fitCenter()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return frenchGallery.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imageGallery);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listItemClickListener.onClickListener(view,getAdapterPosition());

        }
    }
}
