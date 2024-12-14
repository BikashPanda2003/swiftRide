package com.bikash.project.swiftRide.swiftRideApp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SignUpDTO {
    private  String name;
    private  String email;
    private  String password;
}