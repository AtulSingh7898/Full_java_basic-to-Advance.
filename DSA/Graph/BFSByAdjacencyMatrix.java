package Graph;

//BFS By adjacency Matrix by iterative
//1

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFSByAdjacencyMatrix {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public BFSByAdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];

    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        // adjacencyMatrix[destination][source]=1;

    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(startVertex);
        visited[startVertex] = true;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            for (int i = 0; i < numVertices; i++) {
                if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;

                }

            }

        }

    }
    public static void main(String[] args) {
        BFSByAdjacencyMatrix graph=new BFSByAdjacencyMatrix(6);
        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);
        graph.addEdge(4, 5);

        System.out.println("Depth First Search is : ");
        graph.DFS(0);
    }


}   

