class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int[] ans = new int[2];
        int lines=1;
        int value=0;
        int hun=0;
        for(char ch : s.toCharArray()){
            value = widths[ch - 'a'];
            if(hun+value <=100){
                hun+=value;
            }
            else{
                lines++;
                hun = value;
            }
        }
        ans[0]= lines;
        ans[1]= hun;
        return ans;
    }
}