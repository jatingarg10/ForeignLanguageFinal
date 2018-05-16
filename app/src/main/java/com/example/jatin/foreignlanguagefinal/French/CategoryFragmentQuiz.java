package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.jatin.foreignlanguagefinal.R;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.zip.Inflater;


public class CategoryFragmentQuiz extends Fragment {

    View myFragment;

    RecyclerView listCategory;
    RecyclerView.LayoutManager layoutManager;
    FirebaseRecyclerAdapter<Category,CategoryViewHolder> adapter;

    FirebaseDatabase database;
    DatabaseReference categories;

    public static CategoryFragmentQuiz newInstance()
    {
        CategoryFragmentQuiz categoryFragmentQuiz = new CategoryFragmentQuiz();
        return categoryFragmentQuiz;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        database = FirebaseDatabase.getInstance();
        categories = database.getReference("Category");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        listCategory = myFragment.findViewById(R.id.listCategoryFrenchQuiz);
        listCategory.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(container.getContext());
        listCategory.setLayoutManager(layoutManager);

        loadCategories();

        myFragment = inflater.inflate(R.layout.fragment_category_fragment_quiz,container,false);
        return myFragment;
    }

    public void loadCategories()
    {
        adapter = new FirebaseRecyclerAdapter<Category, CategoryViewHolder>(
                Category.class,
                R.layout.category_french_quiz_layout,
                CategoryViewHolder.class,
                categories){
        @Override
        protected void populateViewHolder(CategoryViewHolder viewHolder, final Category model, int position) {
        viewHolder.category_name.setText(model.getName());
        Glide.with(getActivity()).load(model.getImage()).into(viewHolder.category_image);

        viewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void onClick(View view, int position, boolean isLongClick) {
                Toast.makeText(getActivity(), String.format("%s|%s",adapter.getRef(position).getKey(),model.getName()),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
    };
        adapter.notifyDataSetChanged();
        listCategory.setAdapter(adapter);
}
    }

