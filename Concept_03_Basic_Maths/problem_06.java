package Concept_03_Basic_Maths;

public class problem_06 {
    public static void main(String[] args) {

        int num = 26;
        boolean isprime = true;

        if (num <= 1) {
            isprime = false;
        }

        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                isprime = false;
                break;
            }
        }

        System.out.println(isprime);
    }
}
