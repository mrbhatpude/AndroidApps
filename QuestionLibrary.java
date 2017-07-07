package com.example.dell.multiplechoicequiz;

/**
 * Created by dell on 07-07-2017.
 */

public class QuestionLibrary {

    private String mQuestions[] = {
            "Which part of the plant holds it in soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts beed,butterflies and hummingbirds.",
            "The ______ holds the plant upright."
    };

    private String mChoice[] []={


            {"Roots","Stem","Flower"},
            {"Fruit","Leaves","Seeds"},
            {"Bark","Flower","Roots"},
            {"Flower","Leaves","Stem"}
    };

    private String mCorrectAnswers[] = {"Roots","Leave","Flower","Stem"};


    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0 = mChoice[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1 = mChoice[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2 = mChoice[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
