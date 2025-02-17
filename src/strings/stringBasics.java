package strings;

import methods.learnMath;

import java.util.Scanner;

public class stringBasics {
    public static void main(String[] args) {

        /*

         // 1. Primitive Type Comparison (Compares actual values)
        int a = 5;
        int b = 5;
        System.out.println(a == b);  // true (same value)

        char c1 = 'A';
        char c2 = 'A';
        System.out.println(c1 == c2);  // true (same value)

        // 2. Object Reference Comparison (Compares memory addresses)
        String s1 = new String("Hello");
        String s2 = new String("Hello");
        System.out.println(s1 == s2);  // false (different objects in heap)
        System.out.println(s1.equals(s2));  // true (same content)

        // 3. String Pool Optimization (Same reference if using literals)
        String s3 = "Hello";
        String s4 = "Hello";
        System.out.println(s3 == s4);  // true (same reference in String Pool)

        // 4. Wrapper Class Comparison (Integer Caching from -128 to 127)
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println(i1 == i2);  // true (cached reference)

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println(i3 == i4);  // false (different objects)

        // Always use .equals() for object content comparison
        System.out.println(i3.equals(i4));  // true (same value)
        */

        Scanner input = new Scanner(System.in);

        String str = input.next();// For taking input as String

        System.out.println(str);

        String s = new String("Abhigyan");//Creating a new Stirng object which contains Abhigyan stored in heap

        String sr = "Abhigyan";//Created String Literal and it stores in constant string pool

        System.out.println(s == sr);// == checks that it points to same location(reference) or not

        System.out.println(s.equals(sr));// equals check for same content

        String name = "Mritunjay";
        String newName = "mritunjay";

        System.out.println(name.equals(newName));//equals check for same content but here it outputs false because case is different
        System.out.println(name.equalsIgnoreCase(newName));//equalsIgnoreCase : this ignores the case and check for same content


    }
}
