class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        Queue<Integer> pq = new PriorityQueue<>();
        int i=0;
        int d=0;
        int n = heights.length;
        while(i<n-1){
            d=heights[i+1] - heights[i];
            if(d>0 && ladders>0){
                ladders--;
                pq.add(d);
            }
            else if(d > 0 && bricks > 0){
                pq.add(d);
                if(bricks - pq.peek() >=0){
                    bricks -= pq.poll();
                }
                else break;
            }
            else if(d>0) break;
            i++;
        }
        return i;
    }
}