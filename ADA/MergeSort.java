import java.util.Scanner;

public class MergeSort {

    public static void inputValue(int a[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // Merge two sorted subarrays
    public static void merge(int a[], int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++)
            L[i] = a[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = a[mid + 1 + j];

        int i = 0, j = 0, k = left;

        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                a[k++] = L[i++];
            } else {
                a[k++] = R[j++];
            }
        }

        while (i < n1) {
            a[k++] = L[i++];
        }

        while (j < n2) {
            a[k++] = R[j++];
        }
    }

    // Merge Sort recursive function
    public static void mergeSort(int a[], int left, int right) {
        if (left < right) {

            int mid = left + (right - left) / 2;

            mergeSort(a, left, mid);
            mergeSort(a, mid + 1, right);

            merge(a, left, mid, right);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();

        int[] Arr = new int[n];

        System.out.println("Give input from the user:");
        inputValue(Arr);

        System.out.println("Initial array is:");
        printArray(Arr);

        long t1 = System.nanoTime();
        mergeSort(Arr, 0, n - 1);
        long t2 = System.nanoTime();

        System.out.println("Sorted array is:");
        printArray(Arr);

        System.out.println("Time Complexity (Execution Time): " + (t2 - t1) + " nanosec");
    }
}
