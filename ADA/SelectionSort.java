package pkg230760107094;

import java.util.Scanner;

public class SelectionSort {

    public static void inputValue(int a[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static int[] swapInts(int a, int b) {
        int[] result = new int[2];
        result[0] = b;
        result[1] = a;
        return result;
    }

    public static void SelectionSort_algo(int a[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (min != i) {
                int[] swappedValues = swapInts(a[i], a[min]);
                a[i] = swappedValues[0];
                a[min] = swappedValues[1];

            }
            System.out.printf("After %d pass :-", i + 1);
            printArray(a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements in array :-");
        int n = sc.nextInt();
        int[] Arr = new int[n];

        System.out.println("give input from the user");
        inputValue(Arr);

        System.out.println("Initial arary is ");
        printArray(Arr);

        long t1 = System.nanoTime();
        SelectionSort_algo(Arr, n);
        long t2 = System.nanoTime();

        System.out.println("Time Comnplexity is:-" + (t2 - t1) + " nanosec");

    }
}
