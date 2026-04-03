package Graph;

    /*
Union Find:
Union Find groups connected components.
Formula:
Number of islands =
Number of unique parents
Union Find Intuition:
Convert grid → graph
Index formula:
index = row * cols + col
Example:

grid:
1 1
0 1

indexes:
0 1
2 3

Union Find Steps:
Initialize parent array
Each land = its own parent
Union neighbors
Count unique parents

*/


public class UnionFind {


    int[] parent;
    int[] rank;

    public int numIslands(char[][] grid) {

        if(grid==null || grid.length==0) return 0;

        int rows = grid.length;
        int cols = grid[0].length;

        parent = new int[rows*cols];
        rank = new int[rows*cols];

        int count = 0;

        // Initialize parent
        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                if(grid[i][j]=='1'){

                    int index = i*cols+j;

                    parent[index]=index;

                    count++;
                }
            }
        }

        int[][] directions = {
            {1,0},
            {0,1}
        };
        
        for(int i=0;i<rows;i++){

            for(int j=0;j<cols;j++){

                if(grid[i][j]=='1'){

                    for(int[] dir:directions){

                        int newRow = i+dir[0];
                        int newCol = j+dir[1];

                        if(newRow<rows && newCol<cols &&
                           grid[newRow][newCol]=='1'){

                            int x = i*cols+j;
                            int y = newRow*cols+newCol;

                            if(find(x)!=find(y)){

                                union(x,y);
                                
                                count--;
                            }
                        }
                    }
                }
            }
        }

        return count;
    }

    int find(int x){

        if(parent[x]!=x)
            parent[x]=find(parent[x]);

        return parent[x];
    }

    void union(int x,int y){

        int rootX = find(x);
        int rootY = find(y);

        if(rank[rootX]<rank[rootY])
            parent[rootX]=rootY;

        else if(rank[rootX]>rank[rootY])
            parent[rootY]=rootX;

        else{

            parent[rootY]=rootX;
            rank[rootX]++;
        }
    }

    public static void main(String[] args) {
        UnionFind un = new UnionFind();

        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };

        int result = un.numIslands(grid);
        System.out.println(result);

        

    }
    
}
