package Concept_01_Basics;

import java.util.Scanner;

public class problem_03 {
    public static void main(String[] args) {
        /*
         * Given the integer day denoting the day number, print on the screen which day
         * of the week it is. Week starts from Monday and for values greater than 7 or
         * less than 1, print Invalid.
         * Ensure only the 1st letter of the answer is capitalised.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1- 7 to print the day of the week");

        int choice = scanner.nextInt();

        if (choice > 0 && choice < 8) {
            System.out.println("Your choice is : " + choice);
        } else {
            System.out.println("Invalid choice");
        }

        switch (choice) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid choice");
        }

        scanner.close();
    }

}
