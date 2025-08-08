package pkg230760107094;

import java.util.Scanner;

public class InsertionSort {
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
    
    public static void insertion_algo(int[] a,int n){
        for(int i=1;i<n;i++){
            int temp = a[i];
            int j=i-1;
            while(j>=0 && a[j] > temp){
                a[j+1] = a[j];
                j--;
                a[j+1] = temp;
            }
            System.out.println("Ater Passing:-");
            printArray(a);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements in array :-");
        int n = sc.nextInt();
        int[] Arr = new int[n];

        System.out.println("give input from the user");
        inputValue(Arr);

        System.out.println("Initial arary is ");
        printArray(Arr);

        long t1 = System.nanoTime();
        insertion_algo(Arr, n);
        long t2 = System.nanoTime();
        
        System.out.println("After Sorting:-");
        printArray(Arr);
        System.out.println("Time Comnplexity is:-" + (t2 - t1) + " nanosec");
    }

}
