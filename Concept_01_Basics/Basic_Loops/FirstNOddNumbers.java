import java.util.Scanner;

public class FirstNOddNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to print all odd numbers till there");
        int n = scanner.nextInt();

        // Prints :Odd numbers ≤ N
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        // Prints :First N odd numbers
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i - 1);
        }

        scanner.close();
    }

}
