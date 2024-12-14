package com.bikash.project.swiftRide.swiftRideApp.services.implementations;

import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;
import com.bikash.project.swiftRide.swiftRideApp.entities.Ride;
import com.bikash.project.swiftRide.swiftRideApp.entities.enums.RideStatus;
import com.bikash.project.swiftRide.swiftRideApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImplementation implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchRider(RideRequestDTO rideRequest) {

    }

    @Override
    public Ride createRide(RideRequestDTO rideRequest) {
        return null;
    }

    @Override
    public Ride updateRide(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesofRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesofDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
