class Solution {
    public int maxProfit(int[] prices) {
        int ans=0;
        int buy= prices[0];
        int sell= prices[0];
        for(int i=1;i<prices.length;i++){
            if(buy > prices[i]){
                buy = prices[i];
                sell = prices[i];
            }
            else if(sell < prices[i]){
                sell = prices[i];
                ans = Math.max(ans, sell - buy);
            }
        }
        return ans;
    }
}