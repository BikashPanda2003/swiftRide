package com.bikash.project.swiftRide.swiftRideApp.entities;


import com.bikash.project.swiftRide.swiftRideApp.entities.enums.PaymentMethod;
import com.bikash.project.swiftRide.swiftRideApp.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RideRequest {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickUpLocation;

    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;

    @CreationTimestamp
    private LocalDateTime requestedTime;

    @Enumerated(EnumType.STRING)
    private RideRequestStatus rideStatus;

    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;


    private Double fareAmount;
}
