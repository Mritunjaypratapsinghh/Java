package oops;

public class LearnConstructors {
    public static void main(String[] args) {
        // Creating an object with two parameters (real and imaginary parts)
        ComplexNumbers c = new ComplexNumbers(5, 2);
        c.print();  // Output: 5 + 2i

        // Creating another object with two parameters (real and imaginary parts)
        ComplexNumbers c1 = new ComplexNumbers(4, 8);
        c1.print(); // Output: 4 + 8i

        System.out.println("Adding two numbers");

        // Adding two complex numbers (c + c1) using the add() method
        ComplexNumbers result = c.add(c1);

        // Printing the reference of 'c' (this will now print in the format defined in toString())
        System.out.println("Reference of Complex number c: " + c);  // Meaningful output: 5 + 2i

        // Printing the result of the addition (sum of complex numbers)
        System.out.println("Sum of c and c1: " + result);  // Output: 9 + 10i
    }
}

class ComplexNumbers {
    int a; // Real part of the complex number
    int b; // Imaginary part of the complex number

    // Constructor 1: Takes two parameters (real and imaginary parts)
    // Initializes a complex number with specified real and imaginary values
    public ComplexNumbers(int real, int imaginary) {
        this.a = real;  // Set the real part
        this.b = imaginary;  // Set the imaginary part
    }

    // Constructor 2: Overloaded constructor, takes only the real part
    // The imaginary part is set to 6 by default
    public ComplexNumbers(int real) {  // Constructor Overloading
        this.a = real;  // Set the real part
        this.b = 6;  // Set the imaginary part to a default value of 6
    }

    // Method to print the complex number in the format "a + bi"
    public void print() {
        System.out.println(a + " + " + b + "i");  // Output complex number in the form "a + bi"
    }

    // Method to add two complex numbers and return the result as a new ComplexNumbers object
    public ComplexNumbers add(ComplexNumbers num1) {
        // Printing both numbers being added for clarity
        System.out.println("Reference of this:" +this);
        this.print();  // Print the current complex number object (this)
        num1.print();  // Print the other complex number being added

        // Return a new ComplexNumbers object with the sum of real and imaginary parts
        return new ComplexNumbers(this.a + num1.a, this.b + num1.b);  // Return a new sum
    }

}
