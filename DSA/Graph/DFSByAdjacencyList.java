package Graph;

//3
//DFS By adjacency List

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DFSByAdjacencyList {
    private List<List<Integer>> adjacencyList;
    private int numVertices;

    public DFSByAdjacencyList(int numVertices) {
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
        Stack<Integer> stack = new Stack<>();

        stack.push(startVertex);
        visited[startVertex] = true;
        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");
            for (int neighbour : adjacencyList.get(currentVertex)) {
                if (!visited[neighbour]) {
                    stack.push(neighbour);
                    visited[neighbour] = true;

                }

            }

        }

    }

    public static void main(String[] args) {
        DFSByAdjacencyList graph = new DFSByAdjacencyList(6);
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
