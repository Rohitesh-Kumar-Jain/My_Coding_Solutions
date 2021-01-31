class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1,p2) -> p1[0]*p1[0] + p1[1]*p1[1] - p2[0]*p2[0] - p2[1]*p2[1]);
        for(int[] arr : points) pq.add(arr);
        int[][] ans = new int[K][2]; 
        int i=0;
        while(K-- >0) ans[i++]=pq.poll();
        return ans;
    }
}