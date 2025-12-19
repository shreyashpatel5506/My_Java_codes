package ADAPractice;

import java.util.Scanner;

public class mergesort {
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

    public static void MergeSort(int a[],int left,int mid, int right){
        int n1= mid -left+1;
        int n2= right -mid;
        
        int[] L = new int[n1];
        int[] R= new int[n2];

        for (int i = 0; i <n1; i++) {
            L[i] = a[left + i];
        }

        for (int i = 0; i < n2; i++) {
            R[i] = a[mid + i+1];
        }

        int i =0,j=0,k=left;

        while(i<n1 && j <n2){
            if (L[i]<R[j]) {
                a[k++]=L[i++];
            }else{
                a[k++]= R[j++];
            }
        }

        while(i<n1){
            a[k++] = L[i++];

        }
        while(j<n2){
            a[k++] = R[j++];
        }
    }

    public static void Merge(int a[],int left,int right){
        if(left < right){
            int mid = left + (right -left)/2;

            Merge(a,left,mid);
            Merge(a,mid+1,right);

            MergeSort(a,left,mid,right);
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
        int left=0;
        int right= n-1;
        long t1= System.nanoTime();
        Merge(arr,left,right);
        long t2= System.nanoTime();
        
        System.out.println("nano time" +  (t2-t1));
        printArray(arr);
    }
}
