package com.stackRoute.inheritance;

public class Car extends Vehicle {
    boolean automatedOrNot;
    String carModel;
    public boolean isAutomatedOrNot() {
        return automatedOrNot;
    }

    public void setAutomatedOrNot(boolean automatedOrNot) {
        this.automatedOrNot = automatedOrNot;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public String getTypeOfSteering() {
        return typeOfSteering;
    }

    public void setTypeOfSteering(String typeOfSteering) {
        this.typeOfSteering = typeOfSteering;
    }

    String typeOfSteering;

    public void carDetails1(){
        if(automatedOrNot) {

        }
        else {
            System.out.println("It is a automated car");
        }

        int speed = getVehicleSpeed();
        String number = getVehicleNumber();
        long id = getVehicleRegistrationId();
        String color = getVehicleColor();
        int type = getVehicleType();
        System.out.println("Speed"+speed+"km/hr");
        System.out.println("VehicleNumber"+number);
        System.out.println("Id"+id);
        System.out.println("color"+color);
        System.out.println("Type"+type);
    }
}
