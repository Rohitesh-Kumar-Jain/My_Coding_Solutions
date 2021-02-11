class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int meh = nums[0];
        int msf = nums[0];
        for(int i=1;i<nums.length;i++){
            meh = Math.max(nums[i],meh + nums[i]);
            msf = Math.max(msf,meh);
        }
        meh = nums[0];
        int minsf = nums[0];
        for(int i=1;i<nums.length;i++){
            meh = Math.min(nums[i],meh + nums[i]);
            minsf = Math.min(minsf,meh);
        }
        return Math.max(Math.abs(minsf),msf);
    }
}