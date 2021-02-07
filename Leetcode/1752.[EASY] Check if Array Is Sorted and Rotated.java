class Solution {
    public boolean check(int[] nums) {
        int pivot=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                pivot=i+1;
                break;
            }
        }
        System.out.println(pivot);
        int prev= nums[pivot];
        for(int i=pivot+1;i<nums.length;i++){
            if(nums[i]<nums[i-1]) return false;
        }
        prev = nums[nums.length-1];
        for(int i=0;i<pivot;i++){
            if(nums[i]<prev) return false;
            prev = nums[i];
        }
        return true;
    }
}


// lee215's solution :   https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/discuss/1053508/JavaC%2B%2BPython-Easy-and-Concise

public boolean check(int[] A) {
        int k = 0, n = A.length;
        for (int i = 0; i < n; ++i) {
            if (A[i] > A[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
