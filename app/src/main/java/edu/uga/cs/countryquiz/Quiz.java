package edu.uga.cs.countryquiz;

import java.sql.Array;
import java.util.ArrayList;
public class Quiz {

    private ArrayList<Question> questions;
    private int currentIndex;
    private int numberAnswered;
    private int score;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
        this.currentIndex = 0;
        this.numberAnswered = 0;
        this.score = 0;
        updateScore();
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public int getCurrentIndex() {
        return currentIndex;
    }

    public void setCurrentIndex(int currentIndex) {
        this.currentIndex = currentIndex;
    }

    public int getNumberAnswered() {
        return numberAnswered;
    }

    public int getScore() {
        return score;
    }

    public void updateScore() {
        int newAnswered = 0;
        int newScore = 0;

        for (Question q: questions) {
            if (q.isAnswered()) {
                newAnswered++;
            }
            newScore += q.getScore();
        }
        numberAnswered = newAnswered;
        score = newScore;
    }

    public boolean isFinished() {
        return numberAnswered == questions.size();
        //if the index of the question answered is the same as the number of question, return true
    }

    public int getMaxScore() {
        return questions.size();
    }

}
