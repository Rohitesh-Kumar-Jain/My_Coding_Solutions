class Solution {
    public int orangesRotting(int[][] grid) {
        int ans = -1;
        Queue<int []> q = new LinkedList<>();
        int n= grid.length;
        int m = grid[0].length;
        int[][] visited = new int[n][m];
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2){
                    q.add(new int[]{i,j});
                    count++;
                }
            }
        }
        while(q.size()>0){
            ans++;
            int nos = count;
            count =0;
            for(int l=0;l<nos;l++){
                int[] arr = q.poll();
                int i= arr[0];
                int j= arr[1];
                if(i-1 >= 0 && grid[i-1][j]==1){
                    grid[i-1][j]=2;
                    count++;
                    q.add(new int[]{i-1,j});
                }
                if(i+1 < n && grid[i+1][j]==1){
                    grid[i+1][j]=2;
                    count++;
                    q.add(new int[]{i+1,j});
                }
                if(j-1 >=0 && grid[i][j-1]==1){
                    grid[i][j-1]=2;
                    count++;
                    q.add(new int[]{i,j-1});
                }
                if(j+1 < m && grid[i][j+1]==1){
                    grid[i][j+1]=2;
                    count++;
                    q.add(new int[]{i,j+1});
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1) return -1;
            }
        }
        return ans >= 0 ? ans : 0;
    }
}