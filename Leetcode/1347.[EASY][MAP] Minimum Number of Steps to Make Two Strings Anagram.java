class Solution {
    public int minSteps(String s, String t) {
        int ans=0;
        
        int[] freqs = new int[26];
        int[] freqt = new int[26];
        
        for(int i=0;i<s.length();i++){
            freqs[s.charAt(i) - 'a']++;
            freqt[t.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(freqt[i]-freqs[i] >=0 ){
                ans+= freqt[i]-freqs[i];
            }
        }
        
        return ans;
    }
}