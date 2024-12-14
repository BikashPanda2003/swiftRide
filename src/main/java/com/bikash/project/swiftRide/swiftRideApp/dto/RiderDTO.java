package com.bikash.project.swiftRide.swiftRideApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RiderDTO {
    private UserDTO user;
    private double rating;
}
