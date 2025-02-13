package loops;

public class breakAndContinue {
    public static void main(String[] args) {
        //To print only even numbers till 10
        for (int i = 0; i <= 20; i += 2) {

            if (i == 0) {
                continue;
            } else if (i > 10) {
                break;
            }
            System.out.println(i);

        }

        for (int i = 0; i <= 20; i++) {
            if (i == 2 || i == 8) {
                continue;
            }
            if (i >= 15) {
                break;
            }
            System.out.println("gave toffee to: " + i);
        }


        //print 1 to 5, 10 times using nested loops

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j);
            }
            System.out.println(" Printed times: " + i);
        }


        //Print a Pattern print i times in row in increasing form
        /*
        1
        12
        123
        1234
        12345
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
