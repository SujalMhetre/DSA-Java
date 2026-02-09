package Concept_03_Basic_Maths;

public class problem_01 {
    public static void main(String[] args) {

        int n = 1234;
        int count = 0;

        int original = n;

        while (n > 0) {
            n = n / 10;
            count++;
        }

        System.out.println("No of Digit in " + original + " = " + count);
    }
}
