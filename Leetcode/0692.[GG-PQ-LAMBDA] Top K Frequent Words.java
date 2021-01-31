class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> hashmap = new HashMap<>();
        for(String s: words){
            hashmap.put(s,hashmap.getOrDefault(s,0)+1);
        }
        Queue<String> pq = new PriorityQueue<>(
            (a,b) -> hashmap.get(a).equals(hashmap.get(b)) ?
            a.compareTo(b) : hashmap.get(b) - hashmap.get(a) 
        );
        for(String s : hashmap.keySet()){
            pq.add(s);
        }
        List<String> ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(pq.poll());
        }
        return ans;
    }
}



// compressing my code :
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> hashmap = new HashMap<>();
        for(String s: words) hashmap.put(s,hashmap.getOrDefault(s,0)+1);
        Queue<String> pq = new PriorityQueue<>( (a,b) -> hashmap.get(a).equals(hashmap.get(b)) ? a.compareTo(b) : hashmap.get(b) - hashmap.get(a) );
        for(String s : hashmap.keySet()) pq.add(s);
        List<String> ans = new ArrayList<>();
        for(int i=0;i<k;i++) ans.add(pq.poll());
        return ans;
    }
}