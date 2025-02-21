package genericsAndWrapperClasses;

import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        // Creating Integer objects using different approaches
        Integer obj = Integer.valueOf(12); // Preferred way over new Integer()
        Integer obj2 = Integer.valueOf("12"); // Parsing from string

        // Performing arithmetic operation with wrapper class
        System.out.println("Multiplication Result: " + (obj2 * 4));

        // Creating Boolean wrapper object
        Boolean isBoolean = Boolean.valueOf(false);

        // Autoboxing: primitive to wrapper
        Integer obj3 = 12;

        // Unboxing: wrapper to primitive
        int age = obj;

        // Creating an ArrayList that only accepts Integer objects
        ArrayList<Integer> list = new ArrayList<>();
    }
}
