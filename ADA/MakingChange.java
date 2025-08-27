import java.util.Scanner;

public class MakingChange {

    // Input array values
    public static void inputValue(int a[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    // Print array
    public static void printArray(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    // DP function to calculate minimum coins
    public static int MakingChangeCost(int coins[], int amount) {
        int n = coins.length;
        int[][] c = new int[n + 1][amount + 1];

        // If amount = 0, cost = 0 pela coulm ne 0 levana ne 
        for (int i = 0; i <= n; i++) {
            c[i][0] = 0;
        }

        // Initialize first row with unreachble kem ke apde ae kam ma nathi levanu ne 
        for (int j = 1; j <= amount; j++) {
            c[0][j] = Integer.MAX_VALUE / 2; // avoid overflow
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] > j) {  
                    // coin is larger than amount j → cannot use // d[i]>j ama i-1 kem ke apde i che ae 0 thi start thay 
                    c[i][j] = c[i - 1][j];
                }
                else if(i == 1){
                    c[i][j] = 1 + c[i][j - coins[i - 1]];
                } else {
                    c[i][j] = Math.min(c[i - 1][j], 1 + c[i][j - coins[i - 1]]);
                }
            }
        }

        return c[n][amount] >= Integer.MAX_VALUE / 2 ? -1 : c[n][amount];
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input coins
        System.out.print("Enter number of coin types: ");
        int dLength = sc.nextInt();
        int[] coins = new int[dLength];

        System.out.println("Enter coin denominations: ");
        inputValue(coins);

        // Input amount
        System.out.print("Enter amount to make change: ");
        int amount = sc.nextInt();

        int result = MakingChangeCost(coins, amount);

        if (result == -1) {
            System.out.println("Change cannot be made with given coins.");
        } else {
            System.out.println("Minimum coins required = " + result);
        }

        sc.close();
    }
}
