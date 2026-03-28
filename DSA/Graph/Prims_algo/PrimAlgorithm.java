package Graph.Prims_algo;

//before start this algo please study the notes carefully

import java.util.*;

public class PrimAlgorithm {
    private static final int INFINITY = Integer.MAX_VALUE;

    public void prim(int[][] graph) {
        int numVertices = graph.length;
        int[] key = new int[numVertices];
        int[] parent = new int[numVertices];
        boolean[] visited = new boolean[numVertices];

        // Step 1: Initialization
        Arrays.fill(key, INFINITY);
        Arrays.fill(parent, -1);
        key[0] = 0;

        // Step 2: Construct the minimum spanning tree
        for (int i = 0; i < numVertices - 1; i++) {
            int minVertex = findMinKey(key, visited);
            visited[minVertex] = true;

            // Update key values and parents of adjacent vertices
            for (int j = 0; j < numVertices; j++) {
                if (graph[minVertex][j] != 0 && !visited[j] && graph[minVertex][j] < key[j]) {
                    parent[j] = minVertex;
                    key[j] = graph[minVertex][j];
                }
            }
        }

        // Print the minimum spanning tree
        printMST(parent, graph);
    }

    private int findMinKey(int[] key, boolean[] visited) {
        int minKey = INFINITY;
        int minVertex = -1;

        for (int v = 0; v < key.length; v++) {
            if (!visited[v] && key[v] < minKey) {
                minKey = key[v];
                minVertex = v;
            }
        }

        return minVertex;
    }

    private void printMST(int[] parent, int[][] graph) {
        System.out.println("Minimum Spanning Tree (MST):");
        for (int i = 1; i < graph.length; i++) {
            System.out.println("Edge: " + parent[i] + " - " + i + ", Weight: " + graph[i][parent[i]]);
        }
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 2, 0, 6, 0},
            {2, 0, 3, 8, 5},
            {0, 3, 0, 0, 7},
            {6, 8, 0, 0, 9},
            {0, 5, 7, 9, 0}
        };

        PrimAlgorithm prim = new PrimAlgorithm();
        prim.prim(graph);
    }
}
