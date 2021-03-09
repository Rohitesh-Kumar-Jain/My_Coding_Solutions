class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        if(strs.length == 0) return sb.toString();
        int n = strs[0].length();
        for(int i=0;i<n;i++){
            char ch = strs[0].charAt(i);
            for(String s: strs){
                if(s.length() <= i) return sb.toString();
                else{
                    char ch2 = s.charAt(i);
                    if(ch2==ch) ;
                    else return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
} 