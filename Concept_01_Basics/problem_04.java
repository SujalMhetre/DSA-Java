package Concept_01_Basics;

import java.util.Scanner;

public class problem_04 {
    public static void main(String[] args) {
        // Write a function int max_of_four(int a, int b, int c, int d) which returns
        // the maximum of the four arguments it receives.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 4 numbers to print their sum :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        sum_Of_Four(a, b, c, d);

        scanner.close();

    }

    static void sum_Of_Four(int a, int b, int c, int d) {
        int sum = 0;
        sum = a + b + c + d;

        System.out.println("Sum: " + sum);
    }

}
