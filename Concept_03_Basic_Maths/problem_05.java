package Concept_03_Basic_Maths;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class problem_05 {
    public static void main(String[] args) {

        int num = 36;
        // Brute force solution
        // for (int i = 1; i <= num; i++) {
        // if (num % i == 0) {
        // System.out.print(i + " ");
        // }
        // }

        // Optimal Solution
        List<Integer> divisors = new ArrayList<>();

        for (int i = 1; i * i <= num; i++) {
            if (num % i == 0) {
                divisors.add(i);
                if ((num / i) != i) {
                    divisors.add(num / i);
                }
            }

        }

        Collections.sort(divisors);

        for (Integer value : divisors) {
            System.out.print(value + " ");
        }
    }
}
