package edu.uga.cs.countryquiz;

public class Result {
    private final int id;
    private  final String date;
    private final int score;

    public Result(int id, String date, int score) {
        this.id = id;
        this.date = date;
        this.score = score;
    }

    public int getId() {
        return id;
    }
    public String getDate() {
        return date;
    }
     public int getScore() {
        return score;
     }
}
