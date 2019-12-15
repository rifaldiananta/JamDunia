package com.example.moviedatabase;

import com.google.gson.annotations.SerializedName;

public class Data {

    @SerializedName("timezone")
    private String timezone;
    @SerializedName("offset")
    private Integer offset;

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
