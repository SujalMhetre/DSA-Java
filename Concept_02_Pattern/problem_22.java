package Concept_02_Pattern;

public class problem_22 {
    public static void main(String[] args) {

        int n = 9;
        int max = 5;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int top = i;
                int left = j;
                int right = n - 1 - j;
                int bottom = n - 1 - i;

                int minDistance = Math.min(Math.min(left, right), Math.min(top, bottom));

                System.out.print(max - minDistance + " ");
            }
            System.out.println();
        }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
        // System.out.print(4 + " ");
        // } else if (i == 1 || j == 1 || i == n - 2 || j == n - 2) {
        // System.out.print(3 + " ");
        // } else if (i == 2 || j == 2 || i == n - 3 || j == n - 3) {
        // System.out.print(2 + " ");
        // } else {
        // System.out.print(1 + " ");
        // }
        // }
        // System.out.println();
        // }

    }
}
