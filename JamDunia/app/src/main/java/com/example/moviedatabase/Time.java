package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

public class Time {

    @SerializedName("date")
    private String date;
    @SerializedName("time")
    private String time;
    @SerializedName("timezone")
    private String timezone;
    @SerializedName("offset")
    private Integer offset;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

}
