class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        int[] array = new int[2];
        for(int i=0;i<nums.length;i++){
            if(hashmap.containsKey(target-nums[i])){
                array[0]=hashmap.get(target-nums[i]);
                array[1]=i;
                return array;
            }
            hashmap.putIfAbsent(nums[i],i);
        }
        return array;
    }
}