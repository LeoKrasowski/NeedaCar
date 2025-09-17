package com.example.NeedaCar.model;

import java.time.LocalDateTime;

public class Reservation {

    private LocalDateTime pickupDateTime;
    private LocalDateTime dropOffDateTime;
    private String pickupLocation;
    private String dropOffLocation;
    private LocalDateTime rentalDuration;
    private Customer customer;
    private Car car;

    public LocalDateTime getPickupDateTime() {
        return pickupDateTime;
    }
    public void setPickupDateTime(LocalDateTime pickupDateTime) {
        this.pickupDateTime = pickupDateTime;
    }
    public LocalDateTime getDropOffDateTime() {
        return dropOffDateTime;
    }
    public void setDropOffDateTime(LocalDateTime dropOffDateTime) {
        this.dropOffDateTime = dropOffDateTime;
    }
    public String getPickupLocation() {
        return pickupLocation;
    }
    public void setPickupLocation(String pickupLocation) {
        this.pickupLocation = pickupLocation;
    }
    public String getDropOffLocation() {
        return dropOffLocation;
    }
    public void setDropOffLocation(String dropOffLocation) {
        this.dropOffLocation = dropOffLocation;
    }
    public LocalDateTime getRentalDuration() {
        return rentalDuration;
    }
    public void setRentalDuration(LocalDateTime rentalDuration) {
        this.rentalDuration = rentalDuration;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public Car getCar() {
        return car;
    }
    public void setCar(Car car) {
        this.car = car;
    }
}
