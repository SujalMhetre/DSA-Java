package Concept_01_Basics.Input_Output;

import java.util.List;
import java.util.Scanner;

import javax.print.DocFlavor.READER;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();

        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;

            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}