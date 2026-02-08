package Concept_01_Basics;

import java.util.Scanner;

public class problem_01 {
    public static void main(String[] args) {

        // Complete the function printNumber which takes an integer input from the user
        // and prints it on the screen.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number");

        int number = scanner.nextInt();

        System.out.println(number);

        scanner.close();
    }
}
