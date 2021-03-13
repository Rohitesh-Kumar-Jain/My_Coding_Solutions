class Solution { 
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        freqMaper(ransomNote, freq1);
        freqMaper(magazine,freq2);
        for(int i=0;i<26;i++){
            if(freq1[i]>freq2[i]) return false;
        }
        return true;
    }
    
    public void freqMaper(String s, int[] freq){
        for(char ch: s.toCharArray()){
            freq[ch - 'a']++;
        }
    }
}