// Notice if(!hashmap.get(ch).equals(arr[i])) 




class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        int i=0;
        if(pattern.length() != arr.length) return false;
        
        HashMap<Character,String> hashmap = new HashMap<>();
        HashSet<String> hashset = new HashSet<>();
        for(int j=0;j<pattern.length();j++){
            char ch = pattern.charAt(j);
            if(hashmap.containsKey(ch)){
                if(!hashmap.get(ch).equals(arr[i])) return false;
            }
            else{
                hashmap.put(ch,arr[i]);
                if(hashset.contains(arr[i])) return false;
                hashset.add(arr[i]);
            }
            i++;
        }
        return true;
    }
}
