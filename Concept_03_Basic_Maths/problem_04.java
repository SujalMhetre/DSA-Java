package Concept_03_Basic_Maths;

public class problem_04 {
    public static void main(String[] args) {

        int num = 371;
        int original = num;

        int sum = 0;
        int count = 0;

        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }

        temp = num;
        while (temp > 0) {
            int lastDigit = temp % 10;
            sum = sum + (int) Math.pow(lastDigit, count);
            temp = temp / 10;
        }

        System.out.println(sum == original);
    }
}
