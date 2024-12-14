package com.bikash.project.swiftRide.swiftRideApp.strategies;

import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;
import com.bikash.project.swiftRide.swiftRideApp.entities.Driver;

import java.util.List;

public interface DriverFindingStrategy {
    List<Driver> findDrivers(RideRequestDTO rideRequest);
}
