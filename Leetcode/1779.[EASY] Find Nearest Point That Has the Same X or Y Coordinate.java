class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int ans=Integer.MAX_VALUE;
        int i=0;
        int ret=-1;
        for(int[] p : points){
            if(p[0]==x || p[1]==y){
                int d = Math.abs(p[0]-x) + Math.abs(p[1]-y);
                if(ans > d){
                    ans=d;
                    ret=i;
                }
            }
            i++;
        }
        return ret;
    }
}