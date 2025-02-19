package org.example;

public class Car {
       //Instance Variables (Attributes)
        String brand;
        String model;
        String color;
        int speed;

        // Constructor to initialize object
        Car(String brand, String model, String color, int speed){
            this.brand = brand;
            this.model = model;
            this.color = color;
            this.speed = speed;
        }
        // Method to display car details
        void  display(){
            System.out.println("Car Brand:" + brand);
            System.out.println("Car Model:" + model);
            System.out.println("Car Color:" + color);
            System.out.println("Car Speed:" + speed + "km/h");
            System.out.println("________________");
        }

    }