package com.example.NeedaCar.model;

import com.example.NeedaCar.enums.CarBodyType;
import com.example.NeedaCar.enums.CarBrand;
import com.example.NeedaCar.enums.FuelType;
import com.example.NeedaCar.enums.GearBox;
import com.example.NeedaCar.enums.PassengerCapacity;

public class Car {

	private String licencePlate;
	private CarBrand carBrand;
	private GearBox gearBoxType;
	private int passangerPlacesNumber;
	private boolean hasGps;
	private boolean hasChildSeat;
	private double pricePerDay;
	private boolean isAvailable;
	private FuelType fuelType;
	private CarBodyType carBodyType;
	private PassengerCapacity passengerCapacity;


	public String getLicencePlate() {
		return licencePlate;
	}
	public void setLicencePlate(String licencePlate) {
		this.licencePlate = licencePlate;
	}

	public CarBrand getCarBrand() {
		return carBrand;
	}
	public void setCarBrand(CarBrand carBrand) {
		this.carBrand = carBrand;
	}

	public int getPassangerPlacesNumber() {
		return passangerPlacesNumber;
	}
	public void setPassangerPlacesNumber(int passangerPlacesNumber) {
		this.passangerPlacesNumber = passangerPlacesNumber;
	}

	public GearBox getGearBoxType() {
		return gearBoxType;
	}
	public void setGearBoxType(GearBox gearBoxType) {
		this.gearBoxType = gearBoxType;
	}
	
	public boolean isHasGps() {
		return hasGps;
	}
	public void setHasGps(boolean hasGps) {
		this.hasGps = hasGps;
	}

	public boolean isHasChildSeat() {
		return hasChildSeat;
	}
	public void setHasChildSeat(boolean hasChildSeat) {
		this.hasChildSeat = hasChildSeat;
	}

	public double getPricePerDay() {
		return pricePerDay;
	}
	public void setPricePerDay(double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}
	public boolean isAvailable() {
		return isAvailable;
	}
	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public FuelType getFuelType(){
		return fuelType;
	}
	public void setFuelType(FuelType fuelType){
		this.fuelType = fuelType;
	}
	public CarBodyType getCarBodyType(){
		return carBodyType;
	}
	public void setCarBodyType(CarBodyType carBodyType){
		this.carBodyType = carBodyType;
	}
	public PassengerCapacity getPassengerCapacity(){
		return passengerCapacity;
	}
	public void setPassangerCapacity(PassengerCapacity passengerCapacity){
		this.passengerCapacity = passengerCapacity;
	}
}
