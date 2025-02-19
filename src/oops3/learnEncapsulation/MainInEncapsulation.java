package oops3.learnEncapsulation;

import oops3.learnPackage.Person;

public class MainInEncapsulation {

    public static void main(String[] args) {
        // Creating an instance of Person
        Person p1 = new Person();

        // Setting age using setter method (Direct access to private variable is not allowed)
        p1.setAge(10);

        // Getting age using getter method
        System.out.println(p1.getAge());

        // Accessing static variable count
        System.out.println(p1.count); // Access via object
        System.out.println(Person.count); // Access via class

        // Modifying static variable count
        p1.count = 200;//Not Recommended to change static value
        Person.count = 300;//Not Recommended to change static value

        // Creating another instance of Person
        Person p2 = new Person();
        p2.setAge(12);
        System.out.println(p2.getAge());
        System.out.println(p2.count);
        System.out.println(Person.count);

        // Calling static method
        Person.print();

        // Calling non-static method (requires object creation)
        Person obj = new Person();
        obj.print1();

        // Displaying the number of objects created
        System.out.println("No of objects created: " + Person.noOfObjectCreated);
    }
}
