package com.bikash.project.swiftRide.swiftRideApp.repositories;

import com.bikash.project.swiftRide.swiftRideApp.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepo extends JpaRepository<Rider, Long> {
}
