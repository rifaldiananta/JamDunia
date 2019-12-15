package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Post {

    @SerializedName("status")
    private String status;
    @SerializedName("data")
    private Data data;
    @SerializedName("time")
    private Time time;
    @SerializedName("location")
    private Location location;
    @SerializedName("creator")
    private String creator;

    public String getStatus() {
        return status;
    }

    public Data getData() {
        return data;
    }

    public Time getTime() {
        return time;
    }

    public Location getLocation() {
        return location;
    }

    public String getCreator() {
        return creator;
    }

}
