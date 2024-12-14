package com.bikash.project.swiftRide.swiftRideApp.strategies;

import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;

public interface FareCalculationStrategy {
    double calculateFare(RideRequestDTO rideRequest);
}
