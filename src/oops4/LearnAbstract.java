package oops4;

public class LearnAbstract {

    public static void main(String[] args) {
        // Cannot create an object of an abstract class
        // Vehicle v1 = new Vehicle();

        Car c1 = new Car();
        c1.accelerate();
        c1.brakes();
    }
}

// Abstract class Vehicle
abstract class Vehicle {
    // If any method is abstract, the class must be abstract too
    abstract void accelerate();
    abstract void brakes();

    void honk() {
        System.out.println("Vehicle honks");
    }
}

// Concrete class Car extending Vehicle
class Car extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Car is accelerating");
    }

    @Override
    void brakes() {
        System.out.println("Car brakes are pushed");
    }
}

// Concrete class Scooter extending Vehicle
class Scooter extends Vehicle {
    @Override
    void accelerate() {
        System.out.println("Scooter is accelerating");
    }

    @Override
    void brakes() {
        System.out.println("Scooter brakes are pushed");
    }
}
