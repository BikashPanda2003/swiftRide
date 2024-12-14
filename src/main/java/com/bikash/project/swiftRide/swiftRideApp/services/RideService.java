package com.bikash.project.swiftRide.swiftRideApp.services;

import com.bikash.project.swiftRide.swiftRideApp.dto.RideRequestDTO;
import com.bikash.project.swiftRide.swiftRideApp.entities.Ride;
import com.bikash.project.swiftRide.swiftRideApp.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchRider(RideRequestDTO rideRequest);

    Ride createRide(RideRequestDTO rideRequest);

    Ride updateRide(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesofRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesofDriver(Long driverId, PageRequest pageRequest);

}
