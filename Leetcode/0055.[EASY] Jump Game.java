class Solution {
    public boolean canJump(int[] nums) {
        int cur = nums[0];
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(--cur < 0) return false;
            if(cur < nums[i]) cur = nums[i];
        }
        return true;
    }
}