package com.example.NeedaCar.service;

import java.util.ArrayList;
import java.util.List;

import com.example.NeedaCar.model.Car;
import com.example.NeedaCar.model.Reservation;

public class RentalService {
    /*
    This class controls the entire reservation system:
    -List of available cars: stores all vehicles for booking.
    -Methods for finding available cars: checks if there are free cars.
    -Methods for creating bookings: When the client books the car, this class creates booking and updates the status of a car.
    -The history of the reservations: stores a list of all completed bookings.
    */
    private List<Car> availableCars;
    private List<Reservation> reservations;

    public RentalService() {
        availableCars = new ArrayList<>();
        reservations = new ArrayList<>();
    }

    public List<Car> getAvailableCars() {
        return availableCars;
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void addCar(Car car) {
        availableCars.add(car);
    }

    public void removeCar(Car car) {
        availableCars.remove(car);
    }       
}
