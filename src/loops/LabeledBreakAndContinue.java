package loops;

public class LabeledBreakAndContinue {
    public static void main(String[] args) {
        //Labeled Break

        outerLoop:
        // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of outerLoop");
                    break outerLoop; // Exits the outer loop
                }
            }
        }
        System.out.println("Loop exited.");

        //Labeled Continue
        outerLoop:
        // Label for the outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Skipping iteration for i = " + i + ", j = " + j);
                    continue outerLoop; // Skips remaining inner loop execution, moves to next outer iteration
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println("Loop finished.");


    }
}
