package com.bikash.project.swiftRide.swiftRideApp.repositories;

import com.bikash.project.swiftRide.swiftRideApp.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepo extends JpaRepository<Ride, Long> {
}
