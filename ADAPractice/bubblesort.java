package ADAPractice;
import java.util.Scanner;

public class bubblesort {
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

    public static void bubblesort(int a[]){
        for(int i=0;i<a.length;i++){
            int flag=0;
            for (int j = 0; j < a.length - i -1; j++) {
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                    flag=1;
                }

            }
            if(flag == 0){
                break;
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
        bubblesort(arr);
        long t2= System.nanoTime();
        System.out.println("sorted array is " );
        printArray(arr);
        System.out.println("time " + (t2-t1) +"nanosec");
    }
}
