// fast greedy solution.
class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(String s : logs){
            if(s.equals("../")) ans = Math.max(--ans,0);
            else if(s.equals("./")) continue;
            else ans++;
        }
        return ans;
    }
}

// slow regex solution. 
class Solution {
    public int minOperations(String[] logs) {
        int ans=0;
        for(String s : logs){
            if(s.equals("../")) ans = Math.max(--ans,0);
            else if(s.matches("[0-9a-z]+/")) ans++;
        }
        return ans;
    }
}