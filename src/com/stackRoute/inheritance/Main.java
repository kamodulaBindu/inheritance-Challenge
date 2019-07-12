package com.stackRoute.inheritance;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        int gear = 2;
        HondaCity hondaCity = new HondaCity();

        hondaCity.setVehicleColor("OrangeRed");
        hondaCity.setVehicleNumber("KA09 CT 9722");
        hondaCity.setVehicleRegistrationId(72845463);
        hondaCity.setVehicleSpeed(78);
        hondaCity.setVehicleType(4);
        hondaCity.setAutomatedOrNot(false);
        hondaCity.setCarModel("HondaCity");
        hondaCity.setTypeOfSteering("power Steering");

        hondaCity.setSpeedLimit(90);
        hondaCity.setFuelType("petrol");
        hondaCity.setMileage(15);
       hondaCity.getDetails();

        if(hondaCity.getVehicleSpeed()<hondaCity.speedLimit){
            hondaCity.increaseSpeed();
        }
        if(hondaCity.getVehicleSpeed()>hondaCity.speedLimit){
            hondaCity.decreaseSpeed();
        }

    }
}
