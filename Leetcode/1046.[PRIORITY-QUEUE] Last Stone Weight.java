class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int a=0,b=0,ans=0;
        for(int i : stones) pq.add(i);
        while(!pq.isEmpty()){
            a = pq.poll();
            if(pq.isEmpty()) return a;
            else b = pq.poll();
            ans = Math.abs(b-a);
            if(b!=a) pq.add(ans);
        }
        return ans;
    }
}



