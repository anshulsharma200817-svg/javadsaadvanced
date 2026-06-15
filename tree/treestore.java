import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of nodes
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();

        // adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        // create empty lists
        for (int i = 0; i <= n; i++) {
            adj.add(new ArrayList<>());
        }

        // tree has n-1 edges
        System.out.println("Enter " + (n - 1) + " edges:");

        for (int i = 0; i < n - 1; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            // u -> v
            adj.get(u).add(v);

            // v -> u
            adj.get(v).add(u);
        }

        // print adjacency list
        System.out.println("\nAdjacency List:");

        for (int i = 1; i <= n; i++) {

            System.out.print(i + " -> ");

            for (int neighbour : adj.get(i)) {
                System.out.print(neighbour + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}
// adjancy matrix
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // number of nodes
        int n = sc.nextInt();

        // number of edges
        int edges = sc.nextInt();

        // adjacency matrix
        int[][] matrix = new int[n + 1][n + 1];

        // taking all edges input
        for(int i = 0; i < edges; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            // connection both sides
            matrix[u][v] = 1;
            matrix[v][u] = 1;
        }

        // printing matrix
        for(int i = 1; i <= n; i++) {

            for(int j = 1; j <= n; j++) {

                System.out.print(matrix[i][j] + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}