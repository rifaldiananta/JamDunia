package com.example.moviedatabase;

import java.io.Serializable;

public class MovieItem implements Serializable {
    String title, release_date, overview;

    public MovieItem(String title, String release_date, String overview) {
        this.title = title;
        this.release_date = release_date;
        this.overview = overview;
    }


    public String getTitle() {
        return title;
    }

    public String getReleaseDate(){
        return release_date;
    }

    public String getOverview() {
        return overview;
    }

}