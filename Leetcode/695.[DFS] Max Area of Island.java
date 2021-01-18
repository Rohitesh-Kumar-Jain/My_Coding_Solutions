class Solution {
    public static boolean [][] visited;
    public static int n,m;
    public static int count;
    public int maxAreaOfIsland(int[][] grid) {
        n=grid.length;
        m=grid[0].length;
        visited = new boolean[n][m];
        int ans=0;
        
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(visited[i][j]==false && grid[i][j]==1){
                    count=0;
                    dfs(i,j,grid);
                    ans = ans> count ? ans : count;
                }
            }
        }
        return ans;
    }
    
    public void dfs(int i, int j, int[][] grid){
            if(i<0 || i>=n || j<0 || j>=m) return;
            if(visited[i][j]==true) return;
            visited[i][j]=true;
            if(grid[i][j]==0) return;
            count++;
            dfs(i-1,j,grid);
            dfs(i+1,j,grid);
            dfs(i,j-1,grid);
            dfs(i,j+1,grid);
            return;
    }
}
