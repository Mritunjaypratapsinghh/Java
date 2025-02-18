package oops2;

public class Vehicle {
    final int manufacturingYear = 2000;
    int wheelsCount;  // Represents the number of wheels on the vehicle
    String model;     // Represents the model of the vehicle

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
//        v1.manufacturingYear = 2001; //It will cause error because final variable value can not be changed
    }

    // Default constructor of Vehicle class
    Vehicle() {
        System.out.println("Creating a Vehicle Instance");
    }

    // Constructor with an integer parameter to set the number of wheels
    Vehicle(int wheelsCount) {
        this.wheelsCount = wheelsCount;  // Initializes wheelsCount using the constructor parameter
        System.out.println("Creating a Vehicle with wheels");
    }

    // Method to simulate starting the vehicle
    void start() {
        System.out.println("Vehicle is Starting");
    }


    final void speed(){// This is a Final Method, Hence it cannot be overriden;
        System.out.println("Vehicle is Speeding");
    }
}
