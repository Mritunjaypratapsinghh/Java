package genericsAndWrapperClasses;

public class GenericMethods {
    public static void main(String[] args) {
        printData("hello");  // Calling generic static method
        printData(12);

        GenericMethods obj = new GenericMethods();
        obj.doubleData("Any data");  // Calling generic instance method
        obj.doubleData(121);

        CustomClass.doubleData(6);  // Calling static generic method from CustomClass
    }

    // Generic static method to print any type of data
    static <E> void printData(E data) {
        System.out.println(data);
    }

    // Generic instance method to print any type of data
    <E> void doubleData(E data) {
        System.out.println(data);
    }
}

// Custom class with a bounded generic method
class CustomClass {
    // Bounded generic static method that only accepts Numbers
    // This ensures that only Number types (Integer, Double, etc.) can be passed
    public static <E extends Number> void doubleData(E data) {
        System.out.println(data);
    }
}
