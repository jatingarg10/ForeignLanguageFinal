package com.example.jatin.foreignlanguagefinal.Spanish;

import android.content.Context;
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

public class RecyclerAdapterSpanishBooks extends RecyclerView.Adapter<RecyclerAdapterSpanishBooks.MyViewHolder> {

    int[] bookImagesSpanish;
    String [] booksText;
    ListItemClickListener listItemClickListener;
    Context context;

    public RecyclerAdapterSpanishBooks(int[] bookImagesSpanish, String[] booksText, ListItemClickListener listItemClickListener, Context context) {
        this.bookImagesSpanish = bookImagesSpanish;
        this.booksText = booksText;
        this.listItemClickListener = listItemClickListener;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_spanish_books,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(inflate);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Glide.with(context)
                .load(bookImagesSpanish[position])
                .centerCrop()
                .into(holder.booksImage);
        holder.booksText.setText(booksText[position]);

    }

    @Override
    public int getItemCount() {
        return bookImagesSpanish.length;
    }

    public interface ListItemClickListener
    {
        void onListItemClick(View view, int position);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener
    {

        ImageView booksImage;
        TextView booksText;

        public MyViewHolder(View itemView) {
            super(itemView);
            booksImage = itemView.findViewById(R.id.spanishBooksImage);
            booksText = itemView.findViewById(R.id.spanishBooksText);
            booksImage.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            listItemClickListener.onListItemClick(view,getAdapterPosition());
        }
    }
}
