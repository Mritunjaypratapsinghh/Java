package conditionalStatements;
import java.util.Scanner;
public class LearnSwitch {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();

        switch(day){
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is Tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is Thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7: case 0: //Multiple cases works for both cases
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }
}

