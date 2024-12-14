package com.bikash.project.swiftRide.swiftRideApp.dto;

import com.bikash.project.swiftRide.swiftRideApp.entities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private  String name;
    private  String email;
    private Set<Role> roles;
}
