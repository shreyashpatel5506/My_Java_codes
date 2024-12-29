import java.util.Scanner;

public interface Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Enter the element at index " + (i + 1) + " " + (j + 1));
                matrix[i][j] = sc.nextInt();
            }
        }
    }
}
