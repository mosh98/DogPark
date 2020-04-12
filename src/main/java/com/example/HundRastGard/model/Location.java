package com.example.HundRastGard.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotBlank;

public class Location {

    @NotBlank
    private String longitude;

    @NotBlank
    private String latitude;

    @NotBlank
    private String description;




    public Location(@NotBlank @JsonProperty("longitude") String longitude,
                    @NotBlank @JsonProperty("latitude") String latitude,
                    @JsonProperty("description") String description) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.description= description;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getDescription() {
        return description;
    }
}
