/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.sql.Date;

/**
 *
 * @author hieud
 */
public class Rates {

    private int MovieID;
    private int PersonID;
    private String Comment;
    private float NumericRating;
    private Date Time;

    public Rates(int MovieID, int PersonID, String Comment, float NumericRating, Date Time) {
        this.MovieID = MovieID;
        this.PersonID = PersonID;
        this.Comment = Comment;
        this.NumericRating = NumericRating;
        this.Time = Time;
    }

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int MovieID) {
        this.MovieID = MovieID;
    }

    public int getPersonID() {
        return PersonID;
    }

    public void setPersonID(int PersonID) {
        this.PersonID = PersonID;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    public float getNumericRating() {
        return NumericRating;
    }

    public void setNumericRating(float NumericRating) {
        this.NumericRating = NumericRating;
    }

    public Date getTime() {
        return Time;
    }

    public void setTime(Date Time) {
        this.Time = Time;
    }

}
