import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double[] arr = new Double[5];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = sc.nextDouble();
            sum += arr[i];
        }

        System.out.println("Sum of array elements: " + sum);
    }
}
