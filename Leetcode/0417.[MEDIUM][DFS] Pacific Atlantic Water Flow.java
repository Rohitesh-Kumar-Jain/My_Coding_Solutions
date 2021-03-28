class Solution {
    int[][] matrix;
    int n;
    int m;
    int[][] dirc = new int[][]{{-1,0},{1,0},{0,-1},{0,1}};
    public List<List<Integer>> pacificAtlantic(int[][] matrix) {
        this.matrix = matrix;
        List<List<Integer>> positions = new ArrayList<>();
        n = matrix.length;
        if(n==0) return positions;
        m = matrix[0].length;
        boolean[][] pacific = new boolean[n][m];
        boolean[][] atlantic = new boolean[n][m];
        for(int i=0;i<n;i++){
            dfs(i,0,pacific);    // call for left pacific water
            dfs(i,m-1,atlantic);  // call for right atlantic water
        }
        for(int i=0;i<m;i++){
            dfs(0,i,pacific);  // call for top pacific water
            dfs(n-1,i,atlantic); // call for bottom atlantic water
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    positions.add(List.of(i,j));
                }
            }
        }
        return positions;
    }
    public void dfs(int r, int c, boolean[][] ocean){
        ocean[r][c] = true;
        for(int[] dir: dirc){
            int nr = r + dir[0];
            int nc = c + dir[1];
            if(nr < 0 || nc < 0 || nr >=n || nc >=m){
                continue;
            }
            if(ocean[nr][nc]) continue;
            if(matrix[nr][nc] < matrix[r][c]) continue;
            dfs(nr,nc,ocean);
        }
    }
}