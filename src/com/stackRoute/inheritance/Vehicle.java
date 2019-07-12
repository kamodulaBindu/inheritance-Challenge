package com.stackRoute.inheritance;

public class Vehicle {
    String vehicleNumber;
    long vehicleRegistrationId;
    String vehicleColor;
    int vehicleType;
    int vehicleSpeed;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public long getVehicleRegistrationId() {
        return vehicleRegistrationId;
    }

    public void setVehicleRegistrationId(int vehicleRegistrationId) {
        this.vehicleRegistrationId = vehicleRegistrationId;
    }

    public String getVehicleColor() {
        return vehicleColor;
    }

    public void setVehicleColor(String vehicleColor) {
        this.vehicleColor = vehicleColor;
    }

    public int getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(int vehicleType) {
        this.vehicleType = vehicleType;
    }

    public int getVehicleSpeed() {
        return vehicleSpeed;
    }

    public void setVehicleSpeed(int vehicleSpeed) {
        this.vehicleSpeed = vehicleSpeed;
    }
}
