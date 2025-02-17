package conditionalStatements;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age:");//Return type of sout is Void
        int voterAge = input.nextInt();

        if (voterAge > 18) {
            System.out.println("You are eligible for Voting");
        } else if (voterAge == 18) {
            System.out.println("Eligible");
        } else {
            System.out.println("Not Eligible, Age is less than 18");
        }
        System.out.println("Simple if-else if -else");

        /*
        You are given Three Numbers Find the largest One
         */

        int first = input.nextInt();
        int second = input.nextInt();
        int third = input.nextInt();

        //NESTED IF-ELSE
        if (first > second) {
            if (first > third) {
                System.out.println("Largest number is first: " + first);
            } else {
                System.out.println("Largest Number is third:" + third);
            }
        } else {
            if (second > third) {
                System.out.println("Largest Number is second:" + second);
            } else {
                System.out.println("largest Number is third:" + third);
            }
        }

        //Ternary Operator

        //condition?expression1:expression2;   //if condition is True then return expression1 else return expression2

        //Largest of 2 number and store it in max variable
        int a = 10;
        int b = 12;
        int max = 0;
        if (a > b) {
            max = a;
            System.out.println("Largest is a" + max);
        } else {
            max = b;
            System.out.println("Largest is b:" + max);
        }

        //Same thing using ternary operator
        int largest = a > b ? a : b;// we are checking if a>b then return a else return b and store it in largest variable
        System.out.println("Using Ternary:" + largest);

        //Largest from 3 provided Numbers

        int x = 12;
        int y = 15;
        int z = 23;

        //Using Nested Ternary Operator
        int result = x > y ? x > z ? x : z : y > z ? y : z; //if x>y true then check x>z if true return x else z if x>y was false then check y>z true then return y else z
        System.out.println("Largest of 3 Numbers is :" + result);



        int time = input.nextInt();
        // Indicate Current Time, Office timings are 10 am to 8 pm in 24 (hour format) and you need to find out according to input
        // that office is open or closed.
        if(time>=10 && time<=20){ // Here we are using Logical AND Operator
            System.out.println("Office is Open");
        }
        else{
            System.out.println("Office is Closed");
        }


        //IF time is 12 or 6 in 24 hour format then its time for lunch
        if(time==12 || time==18){
            System.out.println("Time for Snacks");
        }
        else{
            System.out.println("Time to Work");
        }

        input.close();

    }
}
