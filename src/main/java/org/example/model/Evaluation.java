package org.example.model;
import java.util.Date;

public class Evaluation {
    private int evaluationId;
    private double score;
    private Date date;
    private Subject subject;


    public Evaluation(){
    }

    public Evaluation(int evaluationId, double score, Date date, Subject subject) {
        this.evaluationId = evaluationId;
        this.score = score;
        this.date = date;
        this.subject = subject;
    }

    public int getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(int idEvaluation) {
        this.evaluationId = idEvaluation;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
