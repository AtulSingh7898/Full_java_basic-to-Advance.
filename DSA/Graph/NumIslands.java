package Graph;

public class NumIslands {

    public static int numIslands(char[][] grid) {

        if (grid==null || grid.length==0) {
            return 0;
            
        }
        int count=0;
        int rows=grid.length;
        int cols=grid[0].length;

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
                if (grid[i][j]=='1') {
                    count++;
                    dfs(grid,i,j);
                    
                }
                
            }
            
        }
        return count;
        
    }

    private static void dfs(char[][] grid,int i,int j){
        int rows=grid.length;
        int cols=grid[0].length;
        if (i<0 || j<0 || i>=rows || j>=cols || grid[i][j]=='0') {
            return;
            
        }

        grid[i][j]='0';
        dfs(grid, i-1, j);//up
        dfs(grid, i+1, j);//down
        dfs(grid, i, j-1);//left
        dfs(grid, i, j+1);//right


    }

    public static void main(String[] args) {
        char[][] grid = {
            {'1','1','0','0','0'},
            {'1','1','0','0','0'},
            {'0','0','1','0','0'},
            {'0','0','0','1','1'}
        };
        int result = numIslands(grid);
        System.out.println(result);

        
    }
    
}
