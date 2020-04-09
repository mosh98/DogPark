package com.example.HundRastGard.service;

import com.example.HundRastGard.dao.LocationDao;
import com.example.HundRastGard.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class LocationService {

    public final LocationDao locationDao;

    @Autowired
    public LocationService(@Qualifier("fakeDao") LocationDao locationDao) {
        this.locationDao = locationDao;
    }

    public int addLocation(Location location){
        return locationDao.insertLocation(location);
    }
}
