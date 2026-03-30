package Graph;

//BFS By adjacency List
//2

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class BFSByAdjacencyList {
    private List<List<Integer>> adjacencyList;
    private int numVertices;

    public BFSByAdjacencyList(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);

        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new ArrayList<>());

        }

    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);

    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");
            for (int neighbour : adjacencyList.get(currentVertex)) {
                if (!visited[neighbour]) {
                    queue.add(neighbour);
                    visited[neighbour] = true;

                }

            }

        }

    }

    public static void main(String[] args) {
        BFSByAdjacencyList graph = new BFSByAdjacencyList(6);
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

