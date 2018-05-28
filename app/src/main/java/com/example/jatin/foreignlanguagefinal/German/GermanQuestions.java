package com.example.jatin.foreignlanguagefinal.German;

/**
 * Created by Jatin on 17-May-18.
 */

public class GermanQuestions {

    public String[] mQuestions =
            {"What is German for number 1?",
                    "What is Mother is German?",
                    "What is the German for Red?",
                    "How do you say Hi in German?",
                    "March in German is called - ",
                    "Saturday in German is known as - ",
                    "Schwarz in English is known as? "};

    private String[][] mAnswers =
            {
                    {"Ein","zwei","drei","vier"},
                    {"Mutter","Vater","Sohn","Tochter"},
                    {"schwarz","rot","grau","Blau"},
                    {"Hallo","Tschüss","guten Morgen","guten Abend"},
                    {"März","kann","Januar","Juli"},
                    {"Samstag","Montag","Dienstag","Sonntag"},
                    {"Red","White","Black","Grey"}
            };

    private String[] mCorrectAnswer = {"Ein","Mutter","rot","Hallo","März","Samstag","Black"};

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
