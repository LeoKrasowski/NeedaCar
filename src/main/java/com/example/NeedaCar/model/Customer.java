package com.example.NeedaCar.model;

public class Customer {

    private String firstName;
    private String lastName;
    private String address;
    private String contactNumber;
    private float drivingPracticeYear;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getContactNumber(){
        return contactNumber;
    }
    public void setContactNumber(String contactNumber){
        this.contactNumber = contactNumber;
    }

    public float getDrivingPracticeYear(){
        return drivingPracticeYear;
    }
    public void setDrivingPracticeYear(float drivingPracticeYear){
        this.drivingPracticeYear = drivingPracticeYear;
    }
}
