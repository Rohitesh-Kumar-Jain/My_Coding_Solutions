class Solution {
    public int countLargestGroup(int n) {
        int maxSize=0;
        int ans=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=0;
            int num = i;
            while(num>0){
                sum += num%10;
                num = num/10;
            }
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        for(int i : map.values()){
           maxSize = Math.max(maxSize,i);
        }
        for(int i: map.keySet()){
            if(map.get(i)==maxSize) ans++;
        }
        return ans;
    }
}