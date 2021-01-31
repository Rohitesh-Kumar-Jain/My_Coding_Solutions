class KthLargest {
    Queue<Integer> pq;
    int n;

    public KthLargest(int k, int[] nums) {
        n =nums.length -k;
        pq = new PriorityQueue<>();
        for(int i: nums){
            pq.add(i);
        }
    }
    
    public int add(int val) {
        pq.add(val);
        n++;
        while(n>0){
            pq.poll();
            n--;
        }
        return pq.peek();
    }
}
