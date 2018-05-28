package com.example.jatin.foreignlanguagefinal.German;

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
 * Created by Jatin on 17-May-18.
 */

public class RecyclerAdapterGermanFamily extends RecyclerView.Adapter<RecyclerAdapterGermanFamily.MyViewHolder> {

    String[] germanFamily;
    String[] germanFamilyTranslate;
    int[] germanFamilyImages;
    ListItemClickListener listItemClickListener;
    Context context;

    public interface ListItemClickListener
    {
        void onClick(View view,int position);
    }

    public RecyclerAdapterGermanFamily(String[] germanFamily, String[] germanFamilyTranslate, int[] fgermanFamilyImages, ListItemClickListener listItemClickListener, Context context) {
        this.germanFamily = germanFamily;
        this.germanFamilyTranslate = germanFamilyTranslate;
        this.germanFamilyImages = fgermanFamilyImages;
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
        holder.txtView.setText(germanFamily[position]);
        holder.txtViewTrans.setText(germanFamilyTranslate[position]);
        holder.txtView.setBackgroundColor(Color.parseColor("#32CD32"));
        holder.txtViewTrans.setBackgroundColor(Color.parseColor("#32CD32"));
        Glide.with(context)
                .load(germanFamilyImages[position])
                .override(150,180)
                .fitCenter()
                .into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return germanFamily.length;
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


