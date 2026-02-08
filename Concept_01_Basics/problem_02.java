package Concept_01_Basics;

import java.util.Scanner;

public class problem_02 {
    public static void main(String[] args) {
        /*
         * Given marks of a student, print on the screen:
         * Grade A if marks >= 90
         * Grade B if marks >= 70
         * Grade C if marks >= 50
         * Grade D if marks >= 35
         * Fail, otherwise.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your marks :");

        int marks = scanner.nextInt();

        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks < 90 && marks >= 70) {
            System.out.println("Grade B");
        } else if (marks < 70 && marks >= 50) {
            System.out.println("Grade C");
        } else if (marks < 50 && marks >= 35) {
            System.out.println("Grade D");
        } else {
            System.out.println("Fail");
        }


        scanner.close();

    }
}
