package org.example.model;

import java.util.Date;

public class Evaluation {
    private int idEvaluation;
    private double score;
    private Date timeStamp;

    public Evaluation(int idEvaluation, double score, Date timeStamp) {
        this.idEvaluation = idEvaluation;
        this.score = score;
        this.timeStamp = timeStamp;
    }

    public Evaluation(){

    }

    public int getIdEvaluation() {
        return idEvaluation;
    }

    public void setIdEvaluation(int idEvaluation) {
        this.idEvaluation = idEvaluation;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }
}
