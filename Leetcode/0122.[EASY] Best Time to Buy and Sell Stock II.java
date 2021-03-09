class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int prof=0;
        int buy= prices[0];
        int sell= prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy > prices[i]){
                buy = prices[i];
                sell = prices[i];
                ans +=prof;
                prof =0;
            }
            else if(sell < prices[i]){
                sell = prices[i];
                prof = Math.max(prof, sell - buy);
            }
            else if(sell > prices[i]){
                ans += prof;
                buy = prices[i];
                sell = prices[i];
                prof =0;
            }
        }
        return ans+prof;
    }
}