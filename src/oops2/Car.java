package oops2;

public class Car extends Vehicle {//Inheriting a Vehicle Class

    String color;


    void start(){// Here we are overriding the method of Parent class
        System.out.println(this);
        System.out.println(this.model+" Car is Starting "+this.color+" is color of this car");

    }

    public static void main(String [] args){
        Car obj = new Car();// Creating object of car class;
        obj.wheelsCount = 4;
        obj.model = "I10";
        obj.color = "black";
        obj.start();


    }
}
