package Concept_01_Basics.Basic_Problems;

import java.util.Scanner;

public class Sum_of_squares_of_first_n_natural_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Naive Approach = Adding square of each number one by one [ O(n)- Time and
        // O(n)- Space]
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i * i);
        }
        System.out.println("First Approach");
        System.out.println(sum);

        // Expected Approach = Formula Based [ O(1)-Time and O(1)- Space]
        // n*(n+1)*(2n+1) / 6

        System.out.println("Second Approach");
        System.out.println((n * (n + 1) / 2) * ((2 * n) + 1) / 3);

        sc.close();
    }

}
