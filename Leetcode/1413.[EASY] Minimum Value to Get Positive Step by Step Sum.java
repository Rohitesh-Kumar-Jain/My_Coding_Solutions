class Solution {
    public int minStartValue(int[] nums) {
        int min = 101;
        int sum=0;
        for(int i : nums){
            sum+=i;
            min = Math.min(min,sum);
        }
        if(min<1) return Math.abs(min-1);
        return 1;
    }
}