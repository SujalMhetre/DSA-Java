package Concept_02_Pattern;

public class problem_21 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {
            // stars
            for (int j = 0; j < 4; j++) {
                if (i == 0 || j == 0 || j == 3 || i == 3) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
