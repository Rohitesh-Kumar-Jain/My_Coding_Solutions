class Solution {
    public boolean checkOnesSegment(String s){
        int n = s.length();
        if(n==1) return true;
        int i=0;
        int flag=0;
        while(i<n-1 && s.charAt(i)=='1' && s.charAt(i+1)=='1'){
            i++;
        }
        while(i<n){
            if(s.charAt(i)=='1') return false;    
        }
        return true;
    }
}