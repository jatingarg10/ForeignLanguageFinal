package com.example.jatin.foreignlanguagefinal.Spanish;

/**
 * Created by Jatin on 30-May-18.
 */

public class SpanishQuestions {

    public String[] mQuestions =
            {"What is Spanish for number 1?",
                    "What is Mother is Spanish?",
                    "What is the Spanish for Red?",
                    "How do you say Hi in Spanish?",
                    "March in Spanish is called - ",
                    "Saturday in Spanish is known as - ",
                    "Negro in English is known as? "};

    private String[][] mAnswers =
            {
                    {"Uno","Tres","Cinco","Ocho"},
                    {"Madre","Padre","Hijo","Hija"},
                    {"Gris","Azul","Rojo","Verde"},
                    {"Hola!","Como Estas","Buenos Dias!","Buenos Noches!"},
                    {"Marzo","Abril","Mayo","Julio"},
                    {"Sabado","Lunes","Martes","Juevas"},
                    {"Red","White","Black","Grey"}
            };

    private String[] mCorrectAnswer = {"Uno","Madre","Rojo","Hola!","Marzo","Sabado","Black"};

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
