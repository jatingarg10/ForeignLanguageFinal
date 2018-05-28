package com.example.jatin.foreignlanguagefinal.French;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Jatin on 17-May-18.
 */

public class FrenchQuestions {



    public String[] mQuestions =
            {"What is french for number 1?",
            "What is Mother is French?",
            "What is the French for Red?",
            "How do you say Hi in French?",
            "March in French is called - ",
            "Saturday in French is known as - ",
            "Noir in English is known as? "};

    private String[][] mAnswers =
            {
                    {"Un","Deux","Trois","Cinq"},
                    {"Mere","Pere","Fils","Sons"},
                    {"Jaune","Noir","Rouge","Marron"},
                    {"Bonjour","Salut","Bonne Nuit","Je vais bien,merci"},
                    {"Avril","Septembre","Novembre","Mars"},
                    {"Lundi","Samedi","Mardi","Mercredi"},
                    {"Red","White","Black","Grey"}
            };

    private String[] mCorrectAnswer = {"Un","Mere","Rouge","Salut","Mars","Samedi","Black"};

    public String getQuestion(int i)
    {
       /* List<String> shuffleList = shuffleList = Arrays.asList(mQuestions);
        Collections.shuffle(shuffleList);*/

        String question = mQuestions[i];
        return question;

        //return shuffleList;
    }

    public String getChoice1(int i)
    {
        String choice = mAnswers[i][0];
        return choice;
    }
    public String getChoice2(int i)
    {
        String choice = mAnswers[i][1];
        return choice;
    }
    public String getChoice3(int i)
    {
        String choice = mAnswers[i][2];
        return choice;
    }
    public String getChoice4(int i)
    {
        String choice = mAnswers[i][3];
        return choice;
    }

    public String getAnswer(int i)
    {
        String answer = mCorrectAnswer[i];
        return answer;
    }





}

