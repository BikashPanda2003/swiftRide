package com.bikash.project.swiftRide.swiftRideApp.strategies.implementations;

import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;
import com.bikash.project.swiftRide.swiftRideApp.entities.Driver;
import com.bikash.project.swiftRide.swiftRideApp.strategies.DriverFindingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NearestDriverStrategy implements DriverFindingStrategy {
    @Override
    public List<Driver> findDrivers(RideRequestDTO rideRequest) {
        return List.of();
    }
}
