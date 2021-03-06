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

public class RecyclerMainMonths extends RecyclerView.Adapter<RecyclerMainMonths.MyViewHolder> {

    String[] spanishMonths;
    String[] spanishMonthsTrans;
    int[] spanishMonthsImage;
    ListItemClickListener listItemClickListener;
    Context context;

    public RecyclerMainMonths(String[] spanishMonths, String[] spanishMonthsTrans, int[] spanishMonthsImage, ListItemClickListener listItemClickListener, Context context) {
        this.spanishMonths = spanishMonths;
        this.spanishMonthsTrans = spanishMonthsTrans;
        this.spanishMonthsImage = spanishMonthsImage;
        this.listItemClickListener = listItemClickListener;
        this.context = context;
    }

    public interface ListItemClickListener
    {
        void onClickListener(View view,int position);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_languages,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.txtView.setText(spanishMonths[position]);
        holder.txtViewTrans.setText(spanishMonthsTrans[position]);
        holder.txtView.setBackgroundColor(Color.parseColor("#2F4F4F"));
        holder.txtViewTrans.setBackgroundColor(Color.parseColor("#2F4F4F"));

        Glide.with(context)
                .load(spanishMonthsImage[position])
                .override(150,180)
                .fitCenter()
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return spanishMonths.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {
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
            listItemClickListener.onClickListener(view,getAdapterPosition());
        }
    }
}
