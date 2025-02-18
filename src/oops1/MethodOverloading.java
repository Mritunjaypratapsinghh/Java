package oops1;

// Method Overloading: Multiple methods can have the same name but different parameters.
public class MethodOverloading {
    public static void main(String[] args) {
        Greet obj = new Greet();

        // Calling different overloaded methods based on parameters
        obj.greetings();               // Calls the method with no parameters
        obj.greetings("Mritunjay");    // Calls the method with one String parameter
        obj.greetings("Hritik");       // Calls the method with one String parameter
        obj.greetings("Singh", 5);     // Calls the method with one String and one int parameter
    }
}

class Greet {
    String name;

    // Method 1: No parameters
    void greetings() {
        System.out.println("Hello, Good Morning");
    }

    // Method 2: Overloaded with one String parameter
    void greetings(String name) {
        System.out.println("Hello, " + name + " Good Morning");
    }

    // Method 3: Overloaded with one String and one int parameter
    void greetings(String name, int count) {
        for (int i = 1; i <= count; i++) {  // Loop runs 'count' times
            System.out.println("Hello, " + name + " Good Morning");
        }
    }
}
