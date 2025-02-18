package oops2;

public class Car extends Vehicle {  // Inheriting from the Vehicle class
    String color;  // Represents the color of the car

    // Constructor of the Car class
    Car(){
        super(2);  // Calls the parent (Vehicle) constructor with the value 2, setting wheelsCount to 2
        System.out.println("Creating a Car Instance");
    }

    // Overriding the start method from Vehicle class
    void start(){
        System.out.println(this);  // Prints the reference of the Car object
        System.out.println(this.model + " Car is Starting, " + this.color + " is the color of this car");
    }

    public static void main(String [] args){
        Car obj = new Car();  // Creating an instance of the Car class
        System.out.println("Parent class Vehicle wheelsCount value: " + obj.wheelsCount);  // Accessing wheelsCount from the parent class
        obj.wheelsCount = 4;  // Modifying the wheelsCount value in the child class
        System.out.println("Overriding Vehicle parent class wheelsCount value by object: " + obj.wheelsCount);  // Updated value of wheelsCount
        obj.model = "I10";  // Setting the model of the car
        obj.color = "black";  // Setting the color of the car
        obj.start();  // Calling the start method of the Car class
    }
}
