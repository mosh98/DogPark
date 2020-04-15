package com.example.HundRastGard.dao;

import com.example.HundRastGard.model.Location;

import java.util.List;
import java.util.Optional;


public interface LocationDao {

    int insertLocation(Location location);

    default int addLocation(Location location){
        return insertLocation(location);
    }

    List<Location> selectAllLocation();


    Optional<String> getCoordinated();

}
