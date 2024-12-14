package com.bikash.project.swiftRide.swiftRideApp.services;

import com.bikash.project.swiftRide.swiftRideApp.dto.DriverDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RideDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RiderDTO;

import java.util.List;

public interface RiderService {
    RideRequestDTO requestRide(RideRequestDTO rideRequest);

    RideDTO cancelRide(long rideId);

    DriverDTO rateDriver(long rideId, Integer rating);

    RiderDTO getMyProfile();

    List<RideDTO> getAllRides();
}
