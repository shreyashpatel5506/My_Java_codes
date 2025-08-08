package pkg230760107094;

import java.util.Scanner;

public class Max_HeapSort {

    public static void inputValue(int[] a, Scanner sc) {
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] a) {
        for (int value : a) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void maxHeapify(int[] a, int n, int i) {
        int largest = i;
        int l = 2 * i + 1; 
        int r = 2 * i + 2; 
        if (l < n && a[l] > a[largest])
            largest = l;

        if (r < n && a[r] > a[largest])
            largest = r;

        if (largest != i) {
            swap(a, i, largest);
            maxHeapify(a, n, largest);
        }
    }

    public static void heapSort(int[] a) {
        int n = a.length;

      System.out.println("Build a HeapSort:-");
        for (int i = n / 2 - 1; i >= 0; i--) {
            maxHeapify(a, n, i);
            printArray(a);
        }
        System.out.println("Deletion Operation");
        for (int i = n - 1; i >= 0; i--) {
            swap(a, 0, i);
            maxHeapify(a, i, 0);
            printArray(a);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements in array:");
        int n = sc.nextInt();
        int[] Arr = new int[n];

        System.out.println("Enter the elements:");
        inputValue(Arr, sc);

        System.out.println("Initial array:");
        printArray(Arr);

        long t1 = System.nanoTime();
        heapSort(Arr);
        long t2 = System.nanoTime();

        System.out.println("Sorted array:");
        printArray(Arr);

        System.out.println("Time Complexity: " + (t2 - t1) + " nanoseconds");

        sc.close();
    }
}
