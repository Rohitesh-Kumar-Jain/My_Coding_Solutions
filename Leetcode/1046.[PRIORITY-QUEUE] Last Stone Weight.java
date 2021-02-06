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



// here's lee215 solution for JAVA
//https://leetcode.com/problems/last-stone-weight/discuss/294956/JavaC%2B%2BPython-Priority-Queue

 public int lastStoneWeight(int[] A) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b)-> b - a);
        for (int a : A)
            pq.offer(a);
        while (pq.size() > 1)
            pq.offer(pq.poll() - pq.poll());
        return pq.poll();
    }