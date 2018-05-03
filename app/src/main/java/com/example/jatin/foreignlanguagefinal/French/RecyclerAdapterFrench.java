package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.content.Intent;
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

public class RecyclerAdapterFrench extends RecyclerView.Adapter<RecyclerAdapterFrench.ViewHolderFrench> {

    String[] data;
    Context mContext;
    private OnItemClickListener mListener;

    public interface OnItemClickListener
    {
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener)
    {
        mListener = listener;
    }

    public RecyclerAdapterFrench(String[] data, Context ctx) {
        this.data = data;
        this.mContext = ctx;
    }

    @Override
    public ViewHolderFrench onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.list_item_languages, parent, false);
        return new ViewHolderFrench(view);
    }

    @Override
    public void onBindViewHolder(ViewHolderFrench holder, int position) {
        String title = data[position];
        holder.frenchTextView.setText(title);
        holder.frenchTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class ViewHolderFrench extends RecyclerView.ViewHolder  {

        ImageView frenchImageView;
        TextView frenchTextView;


        public ViewHolderFrench(View itemView ) {
            super(itemView);

            frenchImageView = (ImageView) itemView.findViewById(R.id.imgView);
            frenchTextView = (TextView) itemView.findViewById(R.id.txtView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(mListener != null)
                    {
                        int position = getAdapterPosition();
                        if(position!= RecyclerView.NO_POSITION)
                        {
                            mListener.onItemClick(position);
                        }
                    }

                }
            });
        }

    }
}



