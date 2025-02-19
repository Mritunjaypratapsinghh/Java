package oops4;

public class LearnAbstract {

    public static void main(String[] args){
//        Vehicle v1 = new Vehicle();// Cannot Create object of abstract class;
        Car c1 = new Car();
        c1.accelerate();
        c1.brakes();
    }
}


abstract class Vehicle{//if any method is abstract inside class then class should be abstract too

    abstract void accelerate();

    abstract void brakes();

    void honks(){
        System.out.println("Vehicle honks");
    }

}

class Car extends Vehicle{
    @Override
    void accelerate(){
        System.out.println("Car is accelerating");
    }

    @Override
    void brakes(){
        System.out.println("Car brakes are pushed");
    }

}

class Scooter extends Vehicle{

    @Override
    void accelerate() {
        System.out.println("Scooter is accelerating");
    }

    @Override
    void brakes() {
        System.out.println("Scooter brakes are pushed");
    }
}