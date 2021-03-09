class Solution {
    public int maxSubArray(int[] nums) {
        int meh = 0;
        int msf = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            meh += nums[i];
            meh = Math.max(nums[i],meh);
            msf = Math.max(meh,msf);
        }
        return msf;
    }
}