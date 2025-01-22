package com.bikash.project.swiftRide.swiftRideApp.strategies.implementations;

import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;
import com.bikash.project.swiftRide.swiftRideApp.strategies.FareCalculationStrategy;

public class DefaultFareCalculationStrategy implements FareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDTO rideRequest) {
        return 0;
    }
}
