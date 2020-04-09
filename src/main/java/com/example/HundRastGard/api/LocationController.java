package com.example.HundRastGard.api;

import com.example.HundRastGard.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/Location")
@RestController
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService ls) {
        locationService = ls;
    }

    //Add location @PostMapping
    public void addLocation(){

    }
    //Get all Location @GetMapping

    //DeletePersonById

}
