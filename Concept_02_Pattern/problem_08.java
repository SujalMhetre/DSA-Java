package Concept_02_Pattern;

public class problem_08 {
    public static void main(String[] args) {

        for (int i = 5; i > 0; i--) {
            // spaces
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }

            // stars
            for (int k = 2 * i - 1; k > 0; k--) {
                System.out.print("*");
            }

            // spaces
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

}
