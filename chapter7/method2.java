package chapter7;

import java.util.Scanner;

public class method2 {
    public static int fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Corrected the recursive calls
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is " + fibonacci(n));
        sc.close();
    }
}
