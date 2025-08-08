
package pkg230760107094;

import java.util.Scanner;

public class BinarySearch {
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
     public static void BinarySearch(int n,int[] a,int target){
         int start = 0;
         int end = a.length - 1;
         
         while(start <= end){
             int mid=start + ((end-start)/2);
             if(a[mid] == target){
                 System.out.println("Target is :-"  + target + "At the postion" + (mid+1));
             }else if(target > a[mid]){
                 start = mid+1;
             }else{
                 end = mid;
             }
         }
     }
    public static void main(String[] args){
        System.out.println("Enter a size of numbers:-");
        Scanner sc1 = new Scanner(System.in);
        int n = sc1.nextInt();
        
        int[] Arr = new int[n];
        System.out.println("give input in increasing order or decreasing order");
        inputValue(Arr);

        System.out.println("Initial arary is ");
        printArray(Arr);
        
        System.out.println("Enter a target value:");
        int target= sc1.nextInt();
        
        long t1 = System.nanoTime();
        BinarySearch(n,Arr,target);
        long t2 = System.nanoTime();
         
         System.out.println("Time Comnplexity is:-" + (t2 - t1) + " nanosec");

    }
}
