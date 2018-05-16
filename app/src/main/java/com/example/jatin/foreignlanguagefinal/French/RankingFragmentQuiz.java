package com.example.jatin.foreignlanguagefinal.French;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jatin.foreignlanguagefinal.R;


public class RankingFragmentQuiz extends Fragment {
    View myFragment;

    public static RankingFragmentQuiz newInstance()
    {
        RankingFragmentQuiz rankingFragmentQuiz = new RankingFragmentQuiz();
        return rankingFragmentQuiz;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        myFragment = inflater.inflate(R.layout.fragment_ranking_fragment_quiz,container,false);
        return myFragment;


    }

}
