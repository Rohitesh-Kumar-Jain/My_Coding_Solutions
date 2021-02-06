class Solution {
    public String reorganizeString(String S) {
        int n = S.length();
        Map<Character,Integer> hm = new HashMap<>();
        for(int i=0;i<S.length();i++){
            hm.put(S.charAt(i),hm.getOrDefault(S.charAt(i),0)+1);
        }
        Queue<Character> pq = new PriorityQueue<>((a,b)-> hm.get(b) - hm.get(a));
        for(char key : hm.keySet()){
            pq.add(key);
        }
        char[] arr = new char[n];
        int i=0;
        char prev = '*';
        System.out.println(pq);
        System.out.println(hm);
        while(i<n){
            if(pq.peek()==prev){
                char temp = pq.poll();
                if(pq.size()==0) return "";
                arr[i] = pq.poll();
                pq.add(temp);
                hm.put(arr[i],hm.getOrDefault(arr[i],0)-1);
                if(hm.get(arr[i])< 0) return "";
                pq.add(arr[i]);
            }
            else{
                arr[i] = pq.poll();
                hm.put(arr[i],hm.getOrDefault(arr[i],0)-1);
                pq.add(arr[i]);   
            }
            prev = arr[i++];
        }
        return new String(arr);
    }
