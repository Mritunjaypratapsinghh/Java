package oops4;

// Class stored in heap memory
class Data {
    int value; // Instance variable stored in heap memory

    // Method to print value
    public void printValue() {
        System.out.println(value);
    }

    // Overloaded method demonstrating compile-time polymorphism
    public void printValue(int value) {
        System.out.println("Overloaded Method, achieving compile-time polymorphism");
    }
}

// Child class demonstrating runtime polymorphism
class ChildData extends Data {
    @Override
    public void printValue() {
        System.out.println("Printing from Overridden method, Achieving runtime polymorphism: " + value);
    }
}

public class LearnPolymorphism {
    public static void main(String[] args) {
        // Primitive variable stored in stack memory
        int number = 5;
        System.out.println("Inside Main Method, number: " + number);

        // Object stored in heap memory, reference stored in stack memory
        Data dataObject = new Data();
        dataObject.value = 1;
        System.out.println("Before changeValue call, object value: " + dataObject.value);

        // Passing primitive (pass-by-value) and object reference (pass-by-reference)
        changeValue(number, dataObject);

        // Number remains unchanged because primitives are passed by value
        System.out.println("Inside Main Method, After changeValue call, number: " + number);

        // Object value changes because objects are passed by reference
        System.out.println("After changeValue call, object value: " + dataObject.value);

        // Demonstrating runtime polymorphism
        Data d = new ChildData();
        d.printValue();

        // Demonstrating compile-time polymorphism
        Data d2 = new Data();
        d2.printValue(5);
    }

    static void changeValue(int number, Data dataObject) {
        // Local primitive variable, modification doesn't affect the original
        number = 10;

        // Modifying object attribute, affects original object in heap memory
        dataObject.value = 100;
        System.out.println("Inside changeValue Method, local number: " + number);
    }
}
