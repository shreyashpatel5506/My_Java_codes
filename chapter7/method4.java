package chapter7;

import java.util.Scanner;

public class method4 {
    public static int digitsum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        System.out.println("The sum of the digits of the number is: " + digitsum(n));
        input.close();
    }
}
