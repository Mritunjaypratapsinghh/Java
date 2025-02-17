package loops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String [] args){

        //While Loop

        //SYNTAX : while(Test Condition){} when test condition fails while loop will break
        int i =0;

        while(i<5){
            System.out.println(i);
            i++;
        }


        // Take a input and ask from user that while loop concept is understood or not and keep running while loop until understood

        Scanner input = new Scanner(System.in);
        boolean hasLearnt = input.nextBoolean();

        while(!hasLearnt){
            System.out.println("Look we are again inside the Loop");
            System.out.println("Did you Understood the while loop?");
            hasLearnt=input.nextBoolean();
        }


    }
}
