import java.util.Scanner;

public class FirstNNatural {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to print number till there :");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);

        }

        scanner.close();
    }

}
