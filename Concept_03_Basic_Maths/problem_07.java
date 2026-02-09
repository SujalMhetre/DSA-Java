package Concept_03_Basic_Maths;

public class problem_07 {
    public static void main(String[] args) {

        // Brutu Force Approach
        
        int n1 = 20;
        int n2 = 40;

        int gcd = 0;

        for (int i = 1; i <= Math.min(n1, n1); i++) {
            if (n2 % i == 0 && n1 % i == 0) {
                gcd = i;
            }
        }
        System.out.println(gcd);


        // Optimal Approach
        // Euclidean algorithm = gcd (a,b) = gcd(a-b,b) --- a>b

        int a = 40;
        int b = 20;

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        System.out.println(a == 0 ? b : a);
    }
}
