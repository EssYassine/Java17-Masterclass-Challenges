package com.lpacademy.oop.Polymorphism;

public class Car {

    private String description;

    public Car() {
    }

    public Car(String description) {
        this.description = description;
    }

    public void startEngine(){
        System.out.println("car -> Start Engine!");
    }
    public void drive(){
        System.out.println("Car -> Driving! Type of the Car : " + getClass().getSimpleName());
    }
    public void runEngine(){
        System.out.println("Car -> Run Engine!" + " Type : " + getClass().getSimpleName());
    }

}
