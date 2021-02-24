class Solution {
    public boolean canChoose(int[][] groups, int[] nums) {
        int l = nums.length;
        int k = 0;
        int n = groups.length;
        for(int i=0;i<n;i++){
            if(k>=l) return false;
            while(groups[i][0]!=nums[k]){
                k++;
                if(k>=l) return false;
            }
            int j=0;
            while(j< groups[i].length){
                if(k>=l) return false;
                if(groups[i][j]==nums[k]){
                    k++;
                    j++;
                }
                else{
                    i--;
                    break;
                }
            }
        }
        return true;
    }
}