package basics2;

import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number:");
        int a = input.nextInt();
        System.out.println(a);

        float b = input.nextFloat();
        System.out.println(b);

        double c = input.nextDouble();
        System.out.println(c);

        long d = input.nextLong();
        System.out.println(d);

        char e = input.next().charAt(3);
        System.out.println(e);
    }


}
