package com.stackRoute.inheritance;

public class HondaCity extends Car {
    int speedLimit;
    int mileage;
    String fuelType;


    public void getDetails()
    {
        String model= getCarModel();
        System.out.println("Model"+model);
        int mileage =getMileage();
        System.out.println("Mileage"+mileage);
        String fuel =getFuelType();
        System.out.println("fuel"+fuel);
        int speed = getSpeedLimit();
        System.out.println("speed"+speed);
        carDetails1();
    }

    public int getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(int speedLimit) {
        this.speedLimit = speedLimit;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }


    public void changingGears(){
        System.out.println("gear changed");
    }
    public void increaseSpeed(){

        System.out.println("speed Increased");
    }
    public void decreaseSpeed(){
        System.out.println("speed Decreased");

    }
    public void Steering(){
        System.out.println("Direction changed");
    }
}
