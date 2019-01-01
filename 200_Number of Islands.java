class Solution {
    public int numIslands(char[][] grid) {
        //DFS wjqrms
        if(grid == null || grid.length == 0 || grid[0].length ==0) return 0;
        
        int numIslands = 0;
        
        // boolean[][] visited;
        for(int i =0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                //1. 섬의 개수를 판단
                int cur = grid[i][j];
                if(cur != '1'){
                    continue;
                }
                numIslands++;
                dfs(grid, i, j);
            }
        }
        
        return numIslands;
    }
    
    public void dfs(char[][] grid, int i, int j){
        grid[i][j] = 'x'; //한번 와봤다.
        //오른쪽 
        if(j + 1 < grid[0].length && grid[i][j+1] == '1') dfs(grid, i , j + 1);
        // 왼쪽
        if(j - 1 >= 0 && grid[i][j-1] == '1') dfs(grid, i , j - 1);
        //위
        if(i - 1 >= 0 && grid[i -1][j] == '1') dfs(grid, i-1 , j);
        // 아래
        if(i + 1 < grid.length && grid[i+1][j] == '1') dfs(grid, i + 1 , j);
    }
}
