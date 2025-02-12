package conditionalStatements;
import java.util.Scanner;
public class ifElse {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your Age:");
        int voterAge = input.nextInt();

        if(voterAge>18){
            System.out.println("You are eligible for Voting");
        }
        else if(voterAge==18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible, Age is less than 18");
        }
        System.out.println("Simple if-else if -else");





    }
}
