package com.example.HundRastGard.dao;

import com.example.HundRastGard.model.Location;


public interface LocationDao {

    int insertLocation(Location location);

    default int addLocation(Location location){
        return insertLocation(location);
    }


}
