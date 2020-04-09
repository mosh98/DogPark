package com.example.HundRastGard.dao;

import com.example.HundRastGard.model.Location;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository("fakeDao")
public class FakeLocationDataAccessService implements LocationDao {

    private static List<Location> DB = new ArrayList<>();

    @Override
    public int insertLocation(Location location) {
        DB.add(new Location(location.getLongitude(),location.getLatitude(),location.getDescription()));
        return 1;
    }
}
