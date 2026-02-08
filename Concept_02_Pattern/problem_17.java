package Concept_02_Pattern;

public class problem_17 {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {

            // spaces
            for (int j = 0; j <= 4 - i - 1; j++) {
                System.out.print(" ");
            }

            // alphabets
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;

            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print(ch);
                if (k <= breakpoint)
                    ch++;
                else
                    ch--;
            }

            // spaces
            for (int j = 0; j <= 4 - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
