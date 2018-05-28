package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jatin.foreignlanguagefinal.R;

/**
 * Created by Jatin on 15-May-18.
 */

public class RecyclerAdapterFrenchPhrases extends RecyclerView.Adapter<RecyclerAdapterFrenchPhrases.MyViewHolder> {
    String[] frenchPhrases;
    String[] frenchPhrasesTranslate;
    int[] frenchPhrasesImages;
    ListItemClickListener listItemClickListener;
    Context context;

    public RecyclerAdapterFrenchPhrases(String[] frenchPhrases, String[] frenchPhrasesTranslate, int[] frenchPhrasesImages, ListItemClickListener listItemClickListener, Context context) {
        this.frenchPhrases = frenchPhrases;
        this.frenchPhrasesTranslate = frenchPhrasesTranslate;
        this.frenchPhrasesImages = frenchPhrasesImages;
        this.listItemClickListener = listItemClickListener;
        this.context = context;
    }



    public interface ListItemClickListener
    {
        void onClick(View view,int position);
    }


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_languages,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtView.setText(frenchPhrases[position]);
        holder.txtViewTrans.setText(frenchPhrasesTranslate[position]);
        holder.txtView.setBackgroundColor(Color.parseColor("#87CEEB"));
        holder.txtViewTrans.setBackgroundColor(Color.parseColor("#87CEEB"));
        Glide.with(context)
                .load(frenchPhrasesImages[position])
                .override(150,180)
                .fitCenter()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return frenchPhrases.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView imageView;
        TextView txtView;
        TextView txtViewTrans;

        public MyViewHolder(View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.imgView);
            txtView = itemView.findViewById(R.id.txtView);
            txtViewTrans = itemView.findViewById(R.id.txtViewTrans);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listItemClickListener.onClick(view,getAdapterPosition());
        }
    }
}
