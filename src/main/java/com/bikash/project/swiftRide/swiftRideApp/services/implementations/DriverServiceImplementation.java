package com.bikash.project.swiftRide.swiftRideApp.services.implementations;

import com.bikash.project.swiftRide.swiftRideApp.dto.DriverDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RideDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RiderDTO;
import com.bikash.project.swiftRide.swiftRideApp.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DriverServiceImplementation implements DriverService {
    @Override
    public RideDTO cancelRide(long rideId) {
        return null;
    }

    @Override
    public RideDTO acceptRide(long rideId) {
        return null;
    }

    @Override
    public RideDTO completeRide(long rideId) {
        return null;
    }

    @Override
    public RiderDTO rateRider(long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllRides() {
        return List.of();
    }
}
