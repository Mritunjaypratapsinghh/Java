package exceptionHandling;

public class FinallyBlockInExceptions {
    public static void main(String[] args) {
        int[] a = new int[5];

        System.out.println("Hello World");

        try{
            System.out.println(a[3]);
        } catch (Exception e) {
            System.out.println("Exception Handled: "+ e.getMessage());
        }finally {
            System.out.println("I will run always");//Even error came this line will run
        }

        System.out.println("Bye world");


    }
}
