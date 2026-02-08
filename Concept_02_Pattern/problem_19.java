package Concept_02_Pattern;

public class problem_19 {
    public static void main(String[] args) {

        int spaces = 0;
        for (int i = 0; i < 5; i++) {
            // stars
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int k = 0; k < spaces; k++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces += 2;
        }

        spaces = 8;
        for (int i = 0; i < 5; i++) {
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int k = spaces; k > 0; k--) {
                System.out.print(" ");
            }
            // stars
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces -= 2;
        }
    }
}
