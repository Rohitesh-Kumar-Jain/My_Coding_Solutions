class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length() == 1) return false; 
        int flag=0;
        int ans=0;
        char ch1= 'A';
        char ch2= 'B';
        for(int i=0;i<s1.length();i++){
            if(flag==0 && s1.charAt(i)!=s2.charAt(i)){
                flag=1;
                ans++;
                ch1 = s1.charAt(i);
                ch2 = s2.charAt(i);
            }
            else if(flag==1 && s1.charAt(i)!=s2.charAt(i)){
                ans++;
                if(ch1!=s2.charAt(i)) return false;
                if(ch2!=s1.charAt(i)) return false;
            }
        }
        if(ans==2 || ans==0) return true;
        return false;
    }
}