class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int pf[] = new int[nums.length];
        pf[0] = nums[0];
        for ( int i = 1 ; i < nums.length; i++) {
            pf[i] = Math.max(pf[i-1],nums[i]);
        }
        int sf[] = new int[nums.length];
        sf[nums.length-1]=nums[nums.length-1];
        for ( int i = nums.length-2 ; i >= 0 ; i--) {
            sf[i] = Math.min(sf[i+1],nums[i]);
        }
        int s = nums.length+1, flag = 0 ;
        for (int i = 0 ; i < nums.length; i++) {
            if((pf[i] - sf[i]) <=k)
            {
                s=Math.min(s,i);
                flag = 1;
            }
        }
        if(flag==1)
            return s; 
        return -1;
    }
}