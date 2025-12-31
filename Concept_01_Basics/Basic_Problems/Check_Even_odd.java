package Concept_01_Basics.Basic_Problems;

import java.util.Scanner;

public class Check_Even_odd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Naive Approch = ' % ' [ O(1) - time and O(1) - space ]

        if (n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Efficient Approach = 'Bitwise &' [ O(1)-Time and O(1)- Space ]

        if ((n & 1) == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }

}
