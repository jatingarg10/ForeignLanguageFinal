package com.example.jatin.foreignlanguagefinal.French;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.jatin.foreignlanguagefinal.R;

/**
 * Created by Jatin on 14-May-18.
 */

public class CategoryViewHolder extends RecyclerView.ViewHolder{

    public TextView category_name;
    public ImageView category_image;

    public ItemClickListener itemClickListener;


    public CategoryViewHolder(View itemView, TextView category_name, ImageView category_image) {
        super(itemView);
        this.category_name = category_name;
        this.category_image = category_image;
    }

    public TextView getCategory_name() {
        return category_name;
    }

    public void setCategory_name(TextView category_name) {
        this.category_name = category_name;
    }

    public ImageView getCategory_image() {
        return category_image;
    }

    public void setCategory_image(ImageView category_image) {
        this.category_image = category_image;
    }

    public void setItemClickListener(ItemClickListener itemClickListener) {
        this.itemClickListener = itemClickListener;
    }



}
