package oops;

public class MainClass {//There can be only 1 Public class inside a file
    public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.name = "Tommy";
        d1.color="black";
        d1.bark();

        Dog d2 = new Dog();
        d2.name = "Leo";
        d2.walk();

        Complex num1 = new Complex();
        num1.a = 3;
        num1.b = 2;
        num1.print();


    }
}


class Complex{
    int a,b;

    void print(){
        System.out.println(a+" + "+b+"i");
    }
}

class Dog{
    String name;
    String color;
    int age;



    public void walk(){
        System.out.println(name+" is Walking");
    }

    public void bark(){
        System.out.println(name+ " is Barking");
    }
}


class Cat{

}
