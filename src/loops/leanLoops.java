package loops;
import java.util.Scanner;
public class leanLoops {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //For loop
        //SYNTAX --:  for(int i=0;i<=n;i++){}

        //Question 1: Print the table of N

        int n = input.nextInt();

        for(int i=1; i<=10; i++){//conditions are separated using semicolon
            System.out.println(n+" X "+i+" = " +n*i);
        }

        //Question 2: Find the sum of N Natural Numbers : formula is N*((N+1)//2)
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Sum Of "+n+" Natural Number is : "+ sum);

        //Question 3: Find the sum of N Even Numbers

        int evenSum =0;
        for(int i=0; i<=n; i++){
            evenSum+=2*i;
        }
        System.out.println("Sum Of "+ n +" Even Numbers Is : "+evenSum);


        //Find Number is Prime or Not

        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=1;
            }
        }
        if(count==2){
            System.out.println(n+" is Prime");
        }
        else{
            System.out.println(n+" not Prime");
        }
    }
}
