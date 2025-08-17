
import java.util.Scanner;

public class PrimeMST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the graph:");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        boolean[] visited = new boolean[n];

        System.err.println("for not connect node is 99");
        // Input graph matrix
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Enter the value of graph matrix for node " + i + " and " + j + ":");
                graph[i][j] = sc.nextInt();
            }
        }

        // Print graph matrix
        System.out.println("The graph matrix is:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        visited[0] = true;
        int count = 0;
        int total = 0;

        while (count < n - 1) {
            int min = 99;
            int u = -1, v = -1;

            for (int i = 0; i < n; i++) {
                if (visited[i]) {
                    for (int j = 0; j < n; j++) {
                        if (!visited[j] && graph[i][j] < min) {
                            min = graph[i][j];
                            u = i;
                            v = j;
                        }
                    }
                }
            }

            if (u != -1 && v != -1) {
                visited[v] = true;
                total += graph[u][v];
                System.out.println("Edge included: " + u + " - " + v + " weight: " + graph[u][v]);
                graph[u][v] = graph[v][u] = 99; // Remove this edge from further consideration
                count++;
            }
        }

        System.out.println("Total weight of MST is: " + total);
        sc.close();
    }
}