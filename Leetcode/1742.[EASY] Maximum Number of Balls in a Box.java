class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer,Integer> hashmap = new HashMap<>();
        for(int i=lowLimit;i<=highLimit;i++){
            int sum=0;
            int n=i;
            while(n>0){
                sum += n%10;
                n=n/10;
            }
            hashmap.put(sum,hashmap.getOrDefault(sum,0)+1);
        }
        int ans=0;
        for(int i: hashmap.values()){
            ans = Math.max(ans,i);
        }
        return ans;
    }
}