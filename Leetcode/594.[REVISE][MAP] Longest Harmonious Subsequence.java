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

































































































































































































// this is my ugly looking incorrect Solution which passed 182/202 test cases, IGNORE THIS 

class Solution {
    public int findLHS(int[] nums) {
        int ans=Integer.MIN_VALUE;
        int curVal=0,curKey=0;
        Arrays.sort(nums);
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i : nums){
            hashmap.put(i,hashmap.getOrDefault(i,0)+1);
            //System.out.println(i);
        }
        //System.out.println(hashmap.values());
        
        Iterator itr = hashmap.entrySet().iterator(); 
        Map.Entry mapElement = (Map.Entry)itr.next();    
        int preVal = (int)mapElement.getValue();
        int preKey = (int)mapElement.getKey();
        int sum=0;
        System.out.println(preKey + " " + preVal);
        while(itr.hasNext()){
            Map.Entry m = (Map.Entry)itr.next();
            curKey = (int)m.getKey();
            System.out.println(curKey);
            if(Math.abs(curKey)==Math.abs(preKey)+1  || (curKey==0 && Math.abs(preKey)==1)){
                curVal = (int)m.getValue();
                //System.out.println("preVal " + preVal + " curVal " + curVal);
                sum = curVal + preVal;
                ans = Math.max(ans,sum);
                sum=0;
                preVal = curVal;
            }
            preVal=(int)m.getValue();
            preKey=curKey;
        }
        if(ans == Integer.MIN_VALUE) return 0;
        return ans;
    }
}