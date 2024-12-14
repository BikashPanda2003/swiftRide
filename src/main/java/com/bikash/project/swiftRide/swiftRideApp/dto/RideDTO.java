package com.bikash.project.swiftRide.swiftRideApp.dto;

import com.bikash.project.swiftRide.swiftRideApp.entities.Driver;
import com.bikash.project.swiftRide.swiftRideApp.entities.Rider;
import com.bikash.project.swiftRide.swiftRideApp.entities.enums.PaymentMethod;
import com.bikash.project.swiftRide.swiftRideApp.entities.enums.RideStatus;

import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

public class RideDTO {
    private Long id;

    private RiderDTO rider;

    private DriverDTO driver;

    private Point pickUpLocation;

    private Point dropOffLocation;

    private LocalDateTime createdTime;

    private RideStatus rideStatus;

    private PaymentMethod paymentMethod;

    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
    private Double fareAmount;
}
