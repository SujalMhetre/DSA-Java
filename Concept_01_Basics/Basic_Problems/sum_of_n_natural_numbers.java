package Concept_01_Basics.Basic_Problems;

import java.util.Scanner;

public class sum_of_n_natural_numbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        // Naive Approach = Using Loop [ O(n) -Time and O(1) - Space ]
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("First Approach");
        System.out.println(sum);

        // Alternate Approach = Using Recursion [ O(n)- Time and O(n) - Space ]

        System.out.println("Second Approach");
        System.out.println(findSum(n));

        // Expected Approach = Formula Based [ O(1)- Time and O(1)-Space ]
        // (n * (n+1)) / 2;

        System.out.println("Third Approach");
        System.out.println((n * (n + 1)) / 2);

        sc.close();
    }

    public static int findSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + findSum(n - 1);
    }

}
