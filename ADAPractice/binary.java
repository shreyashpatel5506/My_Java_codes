package ADAPractice;

import java.util.Scanner;

public class binary {
    public static int binarySearch(int a[] ,int target){
        int left = 0;
        int right = a.length-1;

        while (left<right) {
            int mid = left + (right - left)/2;

            if (a[mid] < target) {
                left = mid +1;
            }
            else if (a[mid] > target) {
                right = mid-1;
            }
            else{
                return mid;
            }

            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of numbers");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

        System.out.println("enter a target");
        int target = sc.nextInt();
        long t1= System.nanoTime();
        binarySearch(arr, target);
        long t2= System.nanoTime();

        System.out.println("target mil gaya" + (t2-t1) + "nanosec");

    }
}
