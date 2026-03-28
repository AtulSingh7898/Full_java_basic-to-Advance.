package Graph;

// DFS By adjacency Matrix by Recursion
//2


public class DFSByAdjacencyMatrix1 {
    private int[][] adjacencyMatrix;
    private int numVertices;
    private boolean[] visited;

    public DFSByAdjacencyMatrix1(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrix = new int[numVertices][numVertices];
        visited = new boolean[numVertices];

    }

    public void addEdge(int source, int destination) {
        adjacencyMatrix[source][destination] = 1;
        // adjacencyMatrix[destination][source]=1;

    }

    public void DFS(int startVertex) {
        visited[startVertex] = true;
        System.out.print(startVertex + " ");
        for (int i = 0; i < numVertices; i++) {
            if (adjacencyMatrix[startVertex][i] == 1 && !visited[i]) {
                DFS(i);
            }

        }

    }

    public static void main(String[] args) {
        DFSByAdjacencyMatrix1 graph = new DFSByAdjacencyMatrix1(6);
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

