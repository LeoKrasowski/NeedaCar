package com.example.NeedaCar.model;

import com.example.NeedaCar.enums.CarBrand;
import com.example.NeedaCar.enums.GearBox;

public class Car {

	private String licencePlate;
	private CarBrand carBrand;
	private GearBox gearBoxType;
	private int passangerPlacesNumber;
	private boolean hasGps;
	private boolean hasChildSeat;
	private double pricePerDay;
	private boolean isAvailable;
	


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

}
