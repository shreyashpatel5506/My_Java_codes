package chapter5;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Enter a number to print table:--");
        int n = sc.nextInt();
        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " * " + i + " = " + n * i);
        }
    }
}
