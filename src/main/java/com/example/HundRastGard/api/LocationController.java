package com.example.HundRastGard.api;

import com.example.HundRastGard.model.Location;
import com.example.HundRastGard.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RequestMapping("api/v1/Location")
@RestController
public class LocationController {

    private final LocationService locationService;

    @Autowired
    public LocationController(LocationService ls) {
        locationService = ls;
    }

    //Add location @PostMappi
    @PostMapping
    public void addLocation(@Valid @NotNull @RequestBody Location location) {
        locationService.addLocation(location);
    }

    //Get all Location
    @GetMapping
   public List<Location> getAllLocation(){
        return locationService.getAllLocation();
   }


}
