class Solution {
    public int maxProfit(int[] prices) {
        int l = 0 , r=0;
        
        int maxP=0;
        while ( l <= r && r<prices.length) {
            maxP=Math.max(maxP,prices[r]-prices[l]);
            if(prices[r]<prices[l]) {
                l=r;
            }
            r++;
        }
        return maxP;
    }
}