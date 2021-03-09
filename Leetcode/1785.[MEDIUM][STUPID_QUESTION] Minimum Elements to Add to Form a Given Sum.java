class Solution {
    public int minElements(int[] nums, int limit, int goal) {
        long sum=0;
        for(long i: nums){
            sum+=i;
        }
        return (int)((Math.abs(goal- sum) + limit -1)/limit);
    }
}