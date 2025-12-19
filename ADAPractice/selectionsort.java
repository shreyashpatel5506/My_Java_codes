package ADAPractice;

import java.util.Scanner;

public class selectionsort {
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

    public static void selectionsort(int a[]){
    
        for (int i = 0; i < a.length -1; i++) {
            int minIndex=i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex =j;
                    
                }
            }
            if(minIndex != i){
                int temp = a[i];
                a[i]= a[minIndex];
                a[minIndex]= temp;
            }
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
        selectionsort(arr);
        long t2= System.nanoTime();
        
        System.out.println("nano time" +  (t2-t1));
        printArray(arr);
    }
}
