class Solution {
    public int maxProfit(int[] prices) {
        
        int n  = prices.length;
        int maxp = 0;
        int minBuy = prices[0];
       

        for(int i =0; i<n; i++){
            int profit = prices[i];
            
            maxp = Math.max(maxp, profit-minBuy);
            minBuy = Math.min(minBuy, profit);
            
        }
        return maxp;
    }
}
