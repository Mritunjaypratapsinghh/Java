package exceptionHandling;

public class MainClass {
    public static void main(String[] args) {
        // Initializing an array with 5 elements
        int[] a = new int[5];

        try {
            // Attempting an arithmetic operation that will cause an exception
            int result = 5 / 0; // This throws ArithmeticException

            // This line won't execute due to the exception above
            System.out.println(a[8]); // This would throw ArrayIndexOutOfBoundsException
        }
        catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            // Handling specific exceptions
            System.out.println("Exception handled: " + e.getMessage());
        }
        catch (Exception e) {
            // Catching any other general exceptions
            System.out.println("General Exception Handled: " + e.getMessage());
        }
    }
}
