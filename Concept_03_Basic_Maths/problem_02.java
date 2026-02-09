package Concept_03_Basic_Maths;

public class problem_02 {
    public static void main(String[] args) {

        int n = 1234;
        int lastDigit = 0;
        int revNum = 0;

        int ogNum = n;

        while (n > 0) {
            lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }

        System.out.println("Reverse of " + ogNum + " = " + revNum);
    }
}
