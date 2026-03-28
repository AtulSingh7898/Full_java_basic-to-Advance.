//DFS By adjacency Matrix by iterative
package Graph;
import java.util.Stack;
//1

public class DFSByAdjacencyMatrix {
    private int[][] adjacencyMatrix;
    private int numVertices;

    public DFSByAdjacencyMatrix(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];

    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        // adjacencyMatrix[destination][source]=1;

    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Stack<Integer> stack = new Stack<>();
        
        stack.push(startVertex);
        visited[startVertex] = true;
        while (!stack.isEmpty()) {
            int currentVertex = stack.pop();
            System.out.print(currentVertex + " ");
            for (int i = 0; i < numVertices; i++) {
                if (adjacencyMatrix[currentVertex][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;

                }

            }

        }

    }
    public static void main(String[] args) {
        DFSByAdjacencyMatrix graph=new DFSByAdjacencyMatrix(6);
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
