package ADAPractice;

import java.util.Scanner;

public class insertionsort {
    public static void inputValue(int a[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            a[i] = sc.nextInt();
        }
    }

    public static void printArray(int a[]){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i] +" ");
        }
    }
    public static void insertionsort(int a[]){
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            int j= i -1;
            while (j >=0 && a[j]> temp){
                a[j+1] = a[j];
                j--;
                a[j+1] = temp;
            }
            printArray(a);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc1= new Scanner(System.in);
        System.out.println("enter a total number of elements");
        n= sc1.nextInt();
        int[] arr = new int[n];
        inputValue(arr);
        printArray(arr);
        long t1= System.nanoTime();
        insertionsort(arr);
        long t2 = System.nanoTime();

        System.out.println("nano time" +  (t2-t1));
        printArray(arr);
       }
}

