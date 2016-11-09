package com.example.havva.softwareprojektt;

/**
 * Created by havva on 03.11.2016.
 */

public class TrueFalse {

    private int mQuestion;
    private boolean mTrueQuestion;

    public int getQuestion() {
        return mQuestion;
    }

    public void setQuestion(int question) {
        mQuestion = question;
    }

    public TrueFalse(int question, boolean trueQuestion){
        mQuestion=question;
        mTrueQuestion=trueQuestion;
    }
}
