package oops3.learnPackage;

public class Person {
    // Private instance variables (Encapsulation)
    private int age;
    private String name;

    // Static variable: shared across all instances
    public static int count = 100;

    // A boolean flag to control if age can be modified
    boolean canBeChanged = true;

    // Static variable to track number of objects created
    public static int noOfObjectCreated;

    // Constructor: Increments noOfObjectCreated each time an object is created
    public Person() {
        noOfObjectCreated++;
    }

    static {
        System.out.println("Called from Static Method");
    }



    public static void main(String[] args) {
        System.out.println("Called from Main Method");

        // Demonstrating the use of a static method from Math class
        System.out.println(Math.max(1, 3));

        // Display number of objects created
        System.out.println("No of objects created: " + noOfObjectCreated);


    }

    // Setter method for private variable 'age'
    public void setAge(int age) {
        if (canBeChanged) { // Check if modification is allowed
            if (age > 0) {  // Ensure age is positive
                this.age = age;
            }
        }
    }

    // Boolean flag for access control
    boolean canBeAccessed = true;

    // Getter method for private variable 'age'
    public int getAge() {
        return age;
    }

    // Static method: Can be called without creating an instance
    public static void print() {
        System.out.println("You can use Static Methods Without instantiating an Object");
    }

    // Non-static method: Requires an instance to call
    public void print1() {
        System.out.println("You have to create an object first to call this method");
    }

    static{
        System.out.println("Called from 2nd Second Static Method");
    }
}
