import java.util.Scanner;

public class MakingChange {

    // Input array values
    public static void inputValue(int a[]) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
    }

    // DP function to calculate minimum coins
    public static int MakingChangeCost(int coins[], int amount) {
        int n = coins.length;
        int[][] c = new int[n + 1][amount + 1];

        // If amount = 0, cost = 0
        for (int i = 0; i <= n; i++) {
            c[i][0] = 0;
        }

        // Initialize first row with unreachable
        for (int j = 1; j <= amount; j++) {
            c[0][j] = Integer.MAX_VALUE / 2; // avoid overflow
        }

        // Fill DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] > j) {
                    c[i][j] = c[i - 1][j];
                } else if (i == 1) {
                    c[i][j] = 1 + c[i][j - coins[i - 1]];
                } else {
                    c[i][j] = Math.min(c[i - 1][j], 1 + c[i][j - coins[i - 1]]);
                }
            }
        }

        // 🔹 Print DP table only once (final table)
        System.out.println("\nFinal DP Table:");
        printTable(c, n, amount, coins);

        return c[n][amount] >= Integer.MAX_VALUE / 2 ? -1 : c[n][amount];
    }

    // Helper to print DP table
    public static void printTable(int[][] c, int rows, int amount, int[] coins) {
        System.out.print("      ");
        for (int j = 0; j <= amount; j++) {
            System.out.printf("%4d", j);
        }
        System.out.println();

        // Row 0 = "no coin"
        System.out.printf("none |");
        for (int j = 0; j <= amount; j++) {
            if (c[0][j] >= Integer.MAX_VALUE / 2) {
                System.out.printf("%4s", "∞");
            } else {
                System.out.printf("%4d", c[0][j]);
            }
        }
        System.out.println();

        // Rows with actual coin values
        for (int i = 1; i <= rows; i++) {
            System.out.printf("%4d |", coins[i - 1]);
            for (int j = 0; j <= amount; j++) {
                if (c[i][j] >= Integer.MAX_VALUE / 2) {
                    System.out.printf("%4s", "∞");
                } else {
                    System.out.printf("%4d", c[i][j]);
                }
            }
            System.out.println();
        }
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
            System.out.println("\nChange cannot be made with given coins.");
        } else {
            System.out.println("\nMinimum coins required = " + result);
        }

        sc.close();
    }
}
