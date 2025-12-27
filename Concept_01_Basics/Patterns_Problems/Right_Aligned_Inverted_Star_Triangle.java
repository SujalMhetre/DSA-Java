package Concept_01_Basics.Patterns_Problems;

import java.util.Scanner;

public class Right_Aligned_Inverted_Star_Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = scanner.nextInt();


        for (int i = n; i > 0; i--) {
            for (int j = n - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = i; k > 0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();

    }

}
