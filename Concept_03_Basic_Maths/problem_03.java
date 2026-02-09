package Concept_03_Basic_Maths;

public class problem_03 {
    public static void main(String[] args) {

        int n = 1331;
        int ogNum = n;
        int revNum = 0;
        int lastDigit = 0;

        while (n > 0) {
            lastDigit = n % 10;
            revNum = (revNum * 10) + lastDigit;
            n = n / 10;
        }
        boolean palindrome = ogNum == revNum;

        System.out.println(palindrome ? ogNum + " is a palindrome" : ogNum + " is not a palindrome");
    }
}
