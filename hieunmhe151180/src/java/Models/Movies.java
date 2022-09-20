/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author hieud
 */
public class Movies {

    private int MovieID;
    private String Title;
    private int Year;
    private String Image;
    private String Description;
    private int GenreID;

    public Movies(int MovieID, String Title, int Year, String Image, String Description, int GenreID) {
        this.MovieID = MovieID;
        this.Title = Title;
        this.Year = Year;
        this.Image = Image;
        this.Description = Description;
        this.GenreID = GenreID;
    }

    public Movies(String Title, int Year, String Image, String Description, int GenreID) {
        this.Title = Title;
        this.Year = Year;
        this.Image = Image;
        this.Description = Description;
        this.GenreID = GenreID;
    }

    

    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int MovieID) {
        this.MovieID = MovieID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getImage() {
        return Image;
    }

    public void setImage(String Image) {
        this.Image = Image;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public int getGenreID() {
        return GenreID;
    }

    public void setGenreID(int GenreID) {
        this.GenreID = GenreID;
    }

}
