class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();
        if(n==0) return 0;
        int i=0, j=n-1;
        while(i<j) if(s.charAt(i++)!=s.charAt(j--)) return 2;
        return 1;
    }
}