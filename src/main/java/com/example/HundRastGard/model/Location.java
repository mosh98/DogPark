package com.example.HundRastGard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class Location {

    @NotBlank
    private long longitude;

    @NotBlank
    private long latitude;

    @NotBlank
    private String description;




    public Location(@NotBlank @JsonProperty("longitude") long longitude, @NotBlank @JsonProperty("latitude") long latitude, @JsonProperty("description") String description) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.description= description;
    }

    public long getLongitude() {
        return longitude;
    }

    public long getLatitude() {
        return latitude;
    }

    public String getDescription() {
        return description;
    }
}
