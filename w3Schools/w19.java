package w3Schools;

import java.util.Scanner;

public class w19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the decimal number: ");
        int n = input.nextInt();

        System.out.println("here is your decimal binary number:---" + Integer.toBinaryString(n));
        System.out.println("here is your decimal octal number:---" + Integer.toOctalString(n));
        System.out.println("here is your decimal hexadecimal number:---" + Integer.toHexString(n));

        // another method
        System.out.println("here is your decimal binary number:---" + Integer.toString(n, 2));
        System.out.println("here is your decimal octal number:---" + Integer.toString(n, 8));
        System.out.println("here is your decimal hexadecimal number:---" + Integer.toString(n, 16));

        input.close();
    }
}