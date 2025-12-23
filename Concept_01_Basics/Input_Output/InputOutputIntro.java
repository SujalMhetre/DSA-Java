import java.util.Scanner;

public class InputOutputIntro {
    public static void main(String[] args) {

        // Problem: Take input of two integers and print their sum.

        // Solution:
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Enter your two numbers");
        x = scanner.nextInt();
        y = scanner.nextInt();

        int sum = x + y;

        System.out.println("Sum of " + x + " and " + y + " is : " + sum);

        scanner.close();

        // Concept Used:
        // Basic input, output, variables.

        // Thinking:
        // - Read input
        // - Store values
        // - Perform operation
        // - Print result

        // Time Complexity:
        // O(1)

        // Space Complexity:
        // O(1)

    }

}
