package oops2;

public class Vehicle {
    int wheelsCount;  // Represents the number of wheels on the vehicle
    String model;     // Represents the model of the vehicle

    // Default constructor of Vehicle class
    Vehicle(){
        System.out.println("Creating a Vehicle Instance");
    }

    // Constructor with an integer parameter to set the number of wheels
    Vehicle(int wheelsCount){
        this.wheelsCount = wheelsCount;  // Initializes wheelsCount using the constructor parameter
        System.out.println("Creating a Vehicle with wheels");
    }

    // Method to simulate starting the vehicle
    void start(){
        System.out.println("Vehicle is Starting");
    }
}
