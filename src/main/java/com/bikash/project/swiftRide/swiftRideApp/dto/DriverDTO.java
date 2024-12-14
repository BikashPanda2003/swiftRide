package com.bikash.project.swiftRide.swiftRideApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DriverDTO {

    private UserDTO user;
    private double rating;
    private String licenseNumber;
}
