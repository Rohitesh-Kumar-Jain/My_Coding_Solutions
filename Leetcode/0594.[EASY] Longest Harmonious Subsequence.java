class Solution {
    public int findLHS(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int i=0,j=0;
        int sum=0;
        int prev = nums[0];
        int flag=0;
        while(j<nums.length){
           if(nums[j]==prev || nums[j]==prev+1){
               if(nums[j]==prev+1){
                   flag=1;
               }
               sum++;
               if(flag==1) ans = Math.max(ans,sum);
               j++;
           }
           else{
               i++;
               prev= nums[i];
               sum=0;
               flag=0;
               j=i;
           }
        }
        return ans;
    }
}


// 4th solution of leetcode article 
blic class Solution {
    public int findLHS(int[] nums) {
        HashMap < Integer, Integer > map = new HashMap < > ();
        int res = 0;
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key: map.keySet()) {
            if (map.containsKey(key + 1))
                res = Math.max(res, map.get(key) + map.get(key + 1));
        }
        return res;
    }
}



// 5th solution of the leetcode article (enhancement of the 4th)

public class Solution {
    public int findLHS(int[] nums) {
        HashMap < Integer, Integer > map = new HashMap < > ();
        int res = 0;
        for (int num: nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
            if (map.containsKey(num + 1))
                res = Math.max(res, map.get(num) + map.get(num + 1));
            if (map.containsKey(num - 1))
                res = Math.max(res, map.get(num) + map.get(num - 1));
        }
        return res;
    }
}
