class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int l=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                if(l > 0) return false;
                l=k;
            }
            else{
                l--;
            }
        }
        return true;
    }
}