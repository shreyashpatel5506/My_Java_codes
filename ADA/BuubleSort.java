import java.util.Scanner;

public class BuubleSort {

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

    public static void bubbleSort(int[] Arr, int n) {
        for (int i = 0; i < n-1; i++) {
            int flag = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (Arr[j] > Arr[j + 1]) {
                    int temp = Arr[j];
                    Arr[j] = Arr[j + 1];
                    Arr[j + 1] = temp;
                    flag = 1;
                }
            }
            System.out.printf("After %d pass :-",i+1);
            printArray(Arr);
            if (flag == 0) {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of elements in array :-");
        int n = sc.nextInt();
        int[] Arr = new int[n];

        System.out.println("give input from the user");
        inputValue(Arr);

        System.out.println("Initial arary is ");
        printArray(Arr);

        long t1 = System.nanoTime();
        bubbleSort(Arr, n);
        long t2 = System.nanoTime();

        System.out.println("Time Comnplexity is:-" + (t2 - t1)+"nanosec");


    }
}
