import java.util.Scanner;
import java.util.Arrays;

public class Question7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elemnets in the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the array is");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // now process for th sort array store in another array
        int[] sortedArr = new int[n];
        int j = 0;
        // usig bubble sort
        for (int i = 0; i < n; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            sortedArr[i] = arr[j];
        }

        if (Arrays.equals(sortedArr, arr)) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
