package com.bikash.project.swiftRide.swiftRideApp.services;

import com.bikash.project.swiftRide.swiftRideApp.dto.DriverDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.SignUpDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.UserDTO;

public interface AuthService {

    String login(String email, String password);

    UserDTO signup(SignUpDTO signupDTO);

    DriverDTO onboardNewDriver(Long userId);
}
