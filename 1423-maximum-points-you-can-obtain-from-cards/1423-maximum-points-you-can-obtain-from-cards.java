class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int lsum = 0 , rsum = 0 , maxsum = 0;
        for (int i = 0 ; i < k; i++) {
            lsum+=cardPoints[i];
        }
        int r = cardPoints.length-1;
        maxsum = lsum;
        for (int i = k-1; i>=0; i--) {
            lsum=lsum-cardPoints[i];
            rsum=rsum + cardPoints[r];
            r--;
            maxsum=Math.max(maxsum,lsum+rsum);
        }
        return maxsum;
    }
}