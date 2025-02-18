package oops1;

public class MainClass { // There can be only one public class per file
    public static void main(String[] args) {
        // Creating Dog objects using constructor
        Dog d1 = new Dog("Tommy", "Black", 3);
        d1.bark();

        Dog d2 = new Dog("Leo", "Brown", 2);
        d2.walk();

        // Creating Complex number objects
        Complex num1 = new Complex(3, 2);
        Complex num2 = new Complex(1, 4);
        Complex sum = num1.add(num2);

        System.out.print("First Complex Number: ");
        num1.print();

        System.out.print("Second Complex Number: ");
        num2.print();

        System.out.print("Sum of Complex Numbers: ");
        sum.print();

        // Creating a Cat object
        Cat c1 = new Cat("Persian");
        c1.meow();
    }
}

// Dog class with private fields, constructor, and getter methods
class Dog {
    private String name;
    private String color;
    private int age;

    // Constructor
    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    // Dog behaviors
    public void walk() {
        System.out.println(name + " is Walking");
    }

    public void bark() {
        System.out.println(name + " is Barking");
    }
}

// Complex class with constructor and method for addition
class Complex {
    private int a, b;

    // Constructor
    public Complex(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to print complex number
    void print() {
        System.out.println(a + " + " + b + "i");
    }

    // Method to add two complex numbers
    Complex add(Complex c) {
        return new Complex(this.a + c.a, this.b + c.b);
    }
}

// Cat class with constructor and method
class Cat {
    private String breed;

    // Constructor
    public Cat(String breed) {
        this.breed = breed;
    }

    public void meow() {
        System.out.println("The " + breed + " cat is meowing");
    }
}
