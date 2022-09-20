/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author hieud
 */
public class Genres {

    private int GenreID;
    private String Description;

    public Genres(int GenreID, String Description) {
        this.GenreID = GenreID;
        this.Description = Description;
    }

    public Genres(String Description) {
        this.Description = Description;
    }


    public int getGenreID() {
        return GenreID;
    }

    public void setGenreID(int GenreID) {
        this.GenreID = GenreID;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
}
