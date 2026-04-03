package Graph;

public class MaxAreaOfIsland {

     public static int maxAreaOfIsland(int[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int row = grid.length; 
        int col = grid[0].length;
        int maxValue = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                int current = dfs(grid, i, j);
                maxValue = Math.max(maxValue,current);
                
            }
        } 
        return maxValue;
    }

    private static int dfs(int[][] grid, int i, int j){
        int row = grid.length; 
        int col = grid[0].length;

        if(i<0|| j < 0|| i>= row|| j>=col || grid[i][j] == 0){
            return 0;
        }

        grid[i][j] = 0;
        int area= 1;
        area+=dfs(grid, i-1, j);
        area+=dfs(grid, i+1, j);
        area+=dfs(grid, i, j-1);
        area+=dfs(grid, i, j+1);
        return area;
    }
    public static void main(String[] args) {

        int[][] grid = {
        {0,0,1,0,0,0,0,1,0,0,0,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,1,1,0,1,0,0,0,0,0,0,0,0},
        {0,1,0,0,1,1,0,0,1,0,1,0,0},
        {0,1,0,0,1,1,0,0,1,1,1,0,0},
        {0,0,0,0,0,0,0,0,0,0,1,0,0},
        {0,0,0,0,0,0,0,1,1,1,0,0,0},
        {0,0,0,0,0,0,0,1,1,0,0,0,0}
        };

        int largestIsland = maxAreaOfIsland(grid);
        System.out.println(largestIsland);


    }
}
