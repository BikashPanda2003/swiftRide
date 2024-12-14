package com.bikash.project.swiftRide.swiftRideApp.repositories;

import com.bikash.project.swiftRide.swiftRideApp.entities.RideRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRequestRepo extends JpaRepository<RideRequest, Long> {
}
