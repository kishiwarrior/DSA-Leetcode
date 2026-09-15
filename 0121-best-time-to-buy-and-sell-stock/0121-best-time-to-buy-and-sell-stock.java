class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int p[] = new int[n];
        int s[] = new int[n];
        p[0] = prices[0];
        s[n-1] = prices[n-1];
        for(int i = 1 ; i < n ; i ++ ) {
            p[i] = Math.min(p[i-1],prices[i]);
        }
        for(int i = n-2; i >= 0 ; i--) {
            s[i] = Math.max(p[i+1],prices[i]);
        }
        int maxProfit = 0;
        for(int i = 0 ; i < n ; i ++ ) {
            maxProfit=Math.max(maxProfit,s[i]-p[i]);
        }
        return maxProfit;
    }
}