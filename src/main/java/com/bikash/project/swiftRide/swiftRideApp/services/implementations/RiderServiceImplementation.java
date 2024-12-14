package com.bikash.project.swiftRide.swiftRideApp.services.implementations;

import com.bikash.project.swiftRide.swiftRideApp.dto.DriverDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RideDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.RiderDTO;
import com.bikash.project.swiftRide.swiftRideApp.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RiderServiceImplementation implements RiderService {
    @Override
    public RideRequestDTO requestRide(RideRequestDTO rideRequest) {
        return null;
    }

    @Override
    public RideDTO cancelRide(long rideId) {
        return null;
    }

    @Override
    public DriverDTO rateDriver(long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDTO getMyProfile() {
        return null;
    }

    @Override
    public List<RideDTO> getAllRides() {
        return List.of();
    }
}
