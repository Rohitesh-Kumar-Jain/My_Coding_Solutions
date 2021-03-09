// My solution:
class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        Queue<int []> q = new LinkedList<>();
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];
        int ans=0;
        int[][] dirs = {{-1,-1},{-1,0},{-1,1},{0,-1},{0,0},{0,1},{1,-1},{1,0},{1,1}};
        if(grid[0][0]==0) q.add(new int[]{0,0});
        int count =1;
        while(q.size()>0){
            int l= count;
            count=0;
            ans++;
            for(int i=0;i<l;i++){
                int point[] = q.poll();
                int x1 = point[0];
                int y1 = point[1];
                if(visited[x1][y1]==true) continue;
                if(x1 == n-1 && y1 == n-1) return ans;
                visited[x1][y1]=true;
                for(int[] dir : dirs){
                    int x = x1 + dir[0];
                    int y = y1 + dir[1];
                    if(x < 0 || y < 0 || x >= n || y >=n || visited[x][y]==true || grid[x][y]== 1) continue;
                    else{
                        q.add(new int[]{x,y});
                        count++;
                    }
                }
            }
        }
        return -1;
    }
}