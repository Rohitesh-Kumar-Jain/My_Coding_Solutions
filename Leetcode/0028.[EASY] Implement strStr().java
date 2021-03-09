class Solution {
    public int strStr(String haystack, String needle) {
        /**
        * Basically in this question you need to implement this function:
        * 
        * haystack.indexOf(needle);
        *
        */
        int n1 = haystack.length();
        int n2 = needle.length();
        if(n2>n1) return -1;
        if(needle.equals("") || haystack.equals("")) return 0;
        int j=0;
        for(int i=0;i<n1;i++){
            if(haystack.charAt(i)==needle.charAt(j)){
                j++;
                if(j==n2) return i - n2 + 1;
            }
            else{
                i= i-j;
                j=0;
            }
        }
        return -1;
    }
}