class Solution {
    public List<String> wordSubsets(String[] A, String[] B) {
        List<String> ans = new ArrayList<>();
        int[] main = new int[26];
        for(String s: B){
            int[] bmap = new int[26];
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                bmap[ch - 'a']++;
            }
            for(int i=0;i<26;i++){
                main[i] = Math.max(main[i],bmap[i]);
            }
        }
        for(String s: A){
            boolean flag = true;
            int[] amap = new int[26];
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                amap[ch - 'a']++;
            }
            for(int i=0;i<26;i++){
                if(amap[i] < main[i]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                ans.add(s);
            }
        }
        return ans;
    }
}