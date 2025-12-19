package ADAPractice;

import java.util.Scanner;

public class HeapSort {
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

    public static void swap(int[] a,int i,int j){
        int temp= a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void maxHeapify(int a[], int n,int i){
        int largest = i;
        int left = 2*i +1;
        int right = 2*i +2;

        if(left<n && a[left] > a[largest]){
            largest = left;
        }

        if (right <n && a[right] > a[largest]) {
            largest = right;
        }

        if (largest != i) {
            swap(a,largest,i);
            maxHeapify(a,n,largest);
        }
    }

    public static void HeapSort(int a[]){
        int n = a.length;

        for(int i = n/2 -1 ; i>=0;i--){
            maxHeapify(a,n,i);
    }

    for (int i = n-1; i >= 0; i--) {
        swap(a,i , 0);
        maxHeapify(a,i,0);
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
        HeapSort(arr);
        long t2 = System.nanoTime();

        System.out.println("nano time" +  (t2-t1));
        printArray(arr);
       }
}
