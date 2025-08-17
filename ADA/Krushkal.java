
import java.util.Scanner;

public class Krushkal {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of nodes in the graph:");
        int n = sc.nextInt();
        int[][] graph = new int[n][n];
        int [] visited = new int[n];
        //visted node show
        for(int i =0;i<n;i++){
            visited[i] = i;
        }

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
        
        
        int c =0;
        int u=-1,v=-1;
        int ucomp,vcomp;
        int total=0;
        while(c<n-1){
            //find a min
            int min = 99;
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(graph[i][j] < min){
                        min = graph[i][j];
                        u=i;
                        v=j;
                    }
                }
            }
            ucomp=visited[u];
            vcomp=visited[v];
            if(ucomp != vcomp && u != -1 && v!= -1){
                total += graph[u][v];
                System.out.println("joined edge u:-" + u + "&v:-" +v + "and them cost is :-" + graph[u][v]);
                c++;
            }
            graph[u][v] = graph[v][u]= 99;
        }
        System.out.println("Total cost is the" + total);
        }
}
