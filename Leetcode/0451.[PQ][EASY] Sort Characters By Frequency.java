class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> hashmap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            hashmap.put(s.charAt(i),hashmap.getOrDefault(s.charAt(i),0)+1);
        }
        Queue<Character> pq = new PriorityQueue<>((a,b) -> hashmap.get(b) - hashmap.get(a));
        for(char ch : hashmap.keySet()){
            pq.add(ch);
        }
        char[] arr = new char[s.length()];
        int i=0;
        while(i < s.length()){
            char ele=pq.poll();
            for(int j=0;j<hashmap.get(ele);j++){
                arr[i++]= ele;
            }
        }
        return new String(arr);
    }
}