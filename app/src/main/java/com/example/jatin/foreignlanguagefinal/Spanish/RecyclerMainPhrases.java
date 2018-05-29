package com.example.jatin.foreignlanguagefinal.Spanish;

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
 * Created by Jatin on 21-May-18.
 */

public class RecyclerMainPhrases extends RecyclerView.Adapter<RecyclerMainPhrases.MyViewHolder> {

    String[] spanishPhrases;
    String[] spanishPhrasesTranslate;
    int[] spanishPhrasesImages;
    ListItemClickListener listItemClickListener;
    Context context;

    public interface ListItemClickListener
    {
        void onClick(View view,int position);
    }

    public RecyclerMainPhrases(String[] spanishPhrases, String[] spanishPhrasesTranslate, int[] spanishPhrasesImages, ListItemClickListener listItemClickListener, Context context) {
        this.spanishPhrases = spanishPhrases;
        this.spanishPhrasesTranslate = spanishPhrasesTranslate;
        this.spanishPhrasesImages = spanishPhrasesImages;
        this.listItemClickListener = listItemClickListener;
        this.context = context;
    }

    @Override
    public RecyclerMainPhrases.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_languages,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerMainPhrases.MyViewHolder holder, int position) {
        holder.txtView.setText(spanishPhrases[position]);
        holder.txtViewTrans.setText(spanishPhrasesTranslate[position]);
        holder.txtView.setBackgroundColor(Color.parseColor("#87CEEB"));
        holder.txtViewTrans.setBackgroundColor(Color.parseColor("#87CEEB"));
        Glide.with(context)
                .load(spanishPhrasesImages[position])
                .override(150,180)
                .fitCenter()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return spanishPhrases.length;
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
