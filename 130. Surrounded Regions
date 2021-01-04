class Solution {
    public static boolean[][] visited;
    public static boolean[][] safe;
    public static int n,m;
    public void solve(char[][] board) {
        n = board.length;
        if(n==0) return;
        m = board[0].length;
        visited = new boolean[n][m];
        safe = new boolean[n][m];
        int[][] arr = {
                        {0,m,0},{}
                      };
        for(int i=0;i<4;i++){
            for(int j=arr[i][0];j<arr[i][1];j++){
                if(board[arr[i][2]][j]=='O') dfs(i,j,board);
            }
        }
            
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                if(safe[i][j]==false && board[i][j]=='O'){
                    board[i][j]='X';
                }
            }
        }
    }
    
    public void dfs(int i, int j, char[][] board){
        if(i<0 || i>=n || j<0 || j>=m) return;
            if(visited[i][j]==true) return;
            visited[i][j]=true;
            if(board[i][j]=='X') return;
            safe[i][j]=true;
            dfs(i-1,j,board);
            dfs(i+1,j,board);
            dfs(i,j-1,board);
            dfs(i,j+1,board);
            return;
    }
    
}
