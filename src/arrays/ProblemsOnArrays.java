package arrays;

public class ProblemsOnArrays {
    public static void main(String[] args){
        int[] numbers = {3,10,3,4,1};
        //Find Sum of array
        int sum=0;
        for(int num: numbers){
            sum+=num;
        }

        System.out.println("Sum Of Array is: "+sum);


        //Find Min of the ARRAY

        int min = Integer.MAX_VALUE; //It contains Maximum Integer Value
        for(int num: numbers){
            if(num<min){
                min = num;
            }
        }
        System.out.println("Minimum Number is: "+ min);

        //Find the MAXIMUM Number in Array:

        int max = Integer.MIN_VALUE;
        for(int num: numbers){
            if(num>max){
                max=num;
            }

        }
        System.out.println("Maximum Number in Array is : "+ max);

    }
}
