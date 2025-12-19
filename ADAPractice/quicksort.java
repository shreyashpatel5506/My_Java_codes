package ADAPractice;

import java.util.Scanner;

public class quicksort {
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

    public static int partition(int a[],int left,int right){
        int pivot = a[left];
        int i= left;
        int j= right;

        while (true) {
            while (i<=j && a[i] <= pivot) {
                i++;
            }

            while(a[j] > pivot){
                j--;

            }

            if (i<j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }else{
                break;
            }
        }

       
        a[left] = a[j];
        a[j] = pivot;
        return j;

    }

    public static void QuickSort(int a[], int left,int right){
        if(left < right){
            int pi = partition(a,left, right);

            QuickSort(a,left,pi-1);
            QuickSort(a,pi+1,right);
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

        int left = 0;
        int right = n-1;
        long t1 = System.nanoTime();
        QuickSort(arr,left,right);
        long t2= System.nanoTime();

        System.out.println("nano time" +  (t2-t1));
        printArray(arr);

    }

}
