class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> hashmap = new HashMap<Integer,Integer>();
        int[] ans = new int[k];
        for(int i: nums){
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hashmap.get(b) - hashmap.get(a));
        for(int i: hashmap.keySet()){
            pq.add(i);
        }
        
        for(int i=0;i<ans.length;i++){
            ans[i]=pq.poll();
        }
        return ans;
    }
}