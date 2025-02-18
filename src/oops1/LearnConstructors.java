package oops1;

public class LearnConstructors {

    /*
     * 'this' refers to the current object, helping to distinguish between
     * instance variables and method/constructor parameters with the same name.
     */

    public static void main(String[] args) {
        // Creating and printing two complex numbers
        ComplexNumbers c = new ComplexNumbers(5, 2);
        c.print();  // Output: 5 + 2i

        ComplexNumbers c1 = new ComplexNumbers(4, 8);
        c1.print(); // Output: 4 + 8i

        System.out.println("Adding two numbers");

        // Adding the two complex numbers and printing the result
        ComplexNumbers result = c.add(c1);
        System.out.println(c);
        result.print();
    }
}

class ComplexNumbers {
    int a; // Real part
    int b; // Imaginary part

    // Constructor to initialize both real and imaginary parts
    public ComplexNumbers(int a, int b) {//Constructor should have same name as Class
        this.a = a;
        this.b = b;
    }

    // Overloaded constructor to initialize only the real part (imaginary part set to 6)
    public ComplexNumbers(int a) {
        this.a = a;
        this.b = 6;
    }

    // Method to print the complex number in "a + bi" format
    public void print() {
        System.out.println(a + " + " + b + "i");
    }

    // Method to add two complex numbers
    public ComplexNumbers add(ComplexNumbers num1) {
        System.out.println(this);;
        num1.print();
        return new ComplexNumbers(this.a + num1.a, this.b + num1.b);
    }


}
