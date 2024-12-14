package com.bikash.project.swiftRide.swiftRideApp.dto;

import com.bikash.project.swiftRide.swiftRideApp.entities.Rider;
import com.bikash.project.swiftRide.swiftRideApp.entities.enums.PaymentMethod;
import com.bikash.project.swiftRide.swiftRideApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDTO {
    private Long id;

    private RiderDTO rider;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime requestedTime;

    private RideRequestStatus rideStatus;

    private PaymentMethod paymentMethod;

    private Double fareAmount;
}
