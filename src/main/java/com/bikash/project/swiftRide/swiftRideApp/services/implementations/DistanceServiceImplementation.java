package com.bikash.project.swiftRide.swiftRideApp.services.implementations;

import com.bikash.project.swiftRide.swiftRideApp.services.DistanceService;
import org.locationtech.jts.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceImplementation implements DistanceService {
    @Override
    public double calculateDistance(Point source, Point destination) {
        return 0;
    }
}
