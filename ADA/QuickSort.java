import java.util.Scanner;

public class QuickSort {

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

    // Partition using FIRST element as pivot
    public static int partition(int a[], int low, int high) {

        int pivot = a[low];   // first element as pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {

            while (i <= high && a[i] <= pivot) {
                i++;
            }

            while (a[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // place pivot at correct position
        int temp = a[low];
        a[low] = a[j];
        a[j] = temp;

        return j;
    }

    // Quick Sort recursive function
    public static void quickSort(int a[], int low, int high) {
        if (low < high) {

            int pi = partition(a, low, high);

            quickSort(a, low, pi - 1);
            quickSort(a, pi + 1, high);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements:");
        int n = sc.nextInt();

        int[] Arr = new int[n];

        System.out.println("Enter array elements:");
        inputValue(Arr);

        System.out.println("Initial array:");
        printArray(Arr);

        long t1 = System.nanoTime();
        quickSort(Arr, 0, n - 1);
        long t2 = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(Arr);

        System.out.println("Execution Time: " + (t2 - t1) + " nanosec");
    }
}
