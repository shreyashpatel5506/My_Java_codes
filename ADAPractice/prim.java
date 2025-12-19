package ADAPractice;

import java.util.Scanner;

public class prim {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number onf nodes");
     int n = sc.nextInt();
     int[][] graph = new int[n][n];   
     boolean[] visited = new boolean[n];

     for (int i = 0; i < graph.length; i++) {
        for (int j = 0; j < graph.length; j++) {
            graph[i][j] = sc.nextInt();
        }
     }

     for (int i = 0; i < visited.length; i++) {
        visited[i] = false;
     }

     visited[0] =true;
     int count = 0;
     int totalCost = 0;
     
     while (count<n-1) {
         int min=99;
         int u = -1, v=-1;
        for (int i = 0; i < n; i++) {
            if (visited[i]) {
                for (int j = 0; j <n; j++) {
                    if(graph[i][j] < min && !visited[j]){
                        min = graph[i][j];
                        u= i;
                        v=j;

                    }
                }
            }
        }

        if (u != -1 && v != -1) {
                visited[v] = true;
                totalCost += graph[u][v];
                System.out.println("Edge included: " + u + " - " + v + " weight: " + graph[u][v]);
                graph[u][v] = graph[v][u] = 99; // Remove this edge from further consideration
                count++;
            }
        }
        System.out.println("Total weight of MST is: " + totalCost);
        sc.close();
    }
}
