class Solution {
    public int largestAltitude(int[] gain) {
        int ans=0;
        int sum=0;
        for(int i : gain){
            sum+=i;
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}