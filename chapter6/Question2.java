import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a element: ");
        double element = sc.nextDouble();
        double nums[] = { 54.5, 34.5, 23.5, 12.5, 45.5 };
        for (double item : nums) {
            if (item == element) {
                System.out.println("Element found in array");
                return;
            } else {
                System.out.println("Element not found in array");
                return;
            }
        }
    }
}
