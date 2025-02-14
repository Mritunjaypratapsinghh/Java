package arrays;

import java.util.Scanner;

public class basicsOfArray {
    public static void main(String[] args){
//        int age[];  // Declaration
//        age = new int[5]; //Allocation

        //single line creation of Array
        int[] age= new int[5];

        age[0]=5;
        age[1]=3;
        age[2]=4;
        System.out.println(age[3]);

        System.out.println(age.length);// to print the length of the array

        //Initialize an Array
        int[] marks = {1,2,3,4,5};
        System.out.println(marks[0]);

        String[] names= {"Ram","Harsh","Aashish","Mritunjay","Yogesh"};

        for(int i=0; i<names.length; i++){
            System.out.println("Name is "+ names[i]);

        }


        //For Each to iterate in ARRAY
        //SYNTAX : for(int variableName: ArrayName){}

        for(String name: names){
            System.out.println("Printing Name Using  For Each Loop "+name);
        }

        //Fill the array by user input

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = input.nextInt();
        int[] nums = new int[n];

        for(int i=0; i<n;i++){
            System.out.println("Enter the number to fill the array:");
            nums[i]=input.nextInt();
        }

        for(int num: nums){
            System.out.print(" "+ num);
        }



    }
}
