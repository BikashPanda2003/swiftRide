package com.bikash.project.swiftRide.swiftRideApp.repositories;

import com.bikash.project.swiftRide.swiftRideApp.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepo extends JpaRepository<Driver, Long> {
}
