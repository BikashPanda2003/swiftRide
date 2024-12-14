package com.bikash.project.swiftRide.swiftRideApp.services;

import com.bikash.project.swiftRide.swiftRideApp.dto.DriverDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RideDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RiderDTO;

import java.util.List;

public interface DriverService {
    RideDTO cancelRide(long rideId);

    RideDTO acceptRide(long rideId);

    RideDTO completeRide(long rideId);

    RiderDTO rateRider(long rideId, Integer rating);

    DriverDTO getMyProfile();

    List<RideDTO> getAllRides();

}
