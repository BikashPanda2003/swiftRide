package com.bikash.project.swiftRide.swiftRideApp.services.implementations;

import com.bikash.project.swiftRide.swiftRideApp.dto.DriverDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.SignUpDTO;
import com.bikash.project.swiftRide.swiftRideApp.dto.UserDTO;
import com.bikash.project.swiftRide.swiftRideApp.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImplementation implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDTO signup(SignUpDTO signupDTO) {
        return null;
    }

    @Override
    public DriverDTO onboardNewDriver(Long userId) {
        return null;
    }
}
