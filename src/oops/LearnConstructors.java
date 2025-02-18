package oops;

public class LearnConstructors {
    public static void main(String[] args) {
        // Creating an object with two parameters
        ComplexNumbers c = new ComplexNumbers(5, 2);
        c.print();  // Output: 5 + 2i

        // Creating an object with only one parameter
        ComplexNumbers c1 = new ComplexNumbers(4);
        c1.print(); // Output: 4 + 6i
    }
}

class ComplexNumbers {
    int a; // Real part
    int b; // Imaginary part

    // Constructor 1: Takes two parameters (real and imaginary parts)
    public ComplexNumbers(int real, int imaginary) {
        a = real;
        b = imaginary;
    }

    // Constructor 2: Overloaded constructor, takes only the real part
    // The imaginary part is set to 6 by default
    public ComplexNumbers(int real) { // Constructor Overloading
        a = real;
        b = 6;
    }

    // Method to print the complex number in a + bi format
    public void print() {
        System.out.println(a + " + " + b + "i");
    }
}
