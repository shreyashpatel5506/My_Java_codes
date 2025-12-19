package ADAPractice;

import java.util.Scanner;

public class krushkal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number of nodes:-");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];
        boolean[] visited = new boolean[n];

    for (int i = 0; i < visited.length; i++) {
        visited[i] = false;
    }


    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {
            graph[i][j] = sc.nextInt();
        }
    }

    int u=-1,v=-1;
    boolean ucomp,vcomp;
    visited[0]= true;

    int edgecount=0;
    int totalCost = 0;
    while (edgecount < n) {
        for (int i = 0; i < n; i++) {
            int min = 99;
            for (int j = 0; j < n; j++) {
                if (graph[i][j] < min) {
                    min = graph[i][j];
                    u = i;
                    v=j;
                }        
            } 
        
        }

        
        ucomp = visited[u];
        vcomp = visited[v];
        if (ucomp != vcomp && u!= -1 && v!= -1) {
            edgecount++;
            totalCost += graph[u][v];
        }
        graph[u][v] = graph[v][u] = 99;
    }
        System.out.println("total cost is :-" + totalCost);
    }
}
