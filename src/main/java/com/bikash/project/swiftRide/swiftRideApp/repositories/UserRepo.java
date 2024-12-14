package com.bikash.project.swiftRide.swiftRideApp.repositories;

import com.bikash.project.swiftRide.swiftRideApp.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {
}
