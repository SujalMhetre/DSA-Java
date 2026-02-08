package Concept_02_Pattern;

public class problem_12 {
    public static void main(String[] args) {

        int space = 2 * (4 - 1);

        for (int i = 1; i < 5; i++) {
            // numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // spaces
            for (int k = 1; k <= space; k++) {
                System.out.print(" ");
            }
            // numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            space -= 2;
        }
    }
}
