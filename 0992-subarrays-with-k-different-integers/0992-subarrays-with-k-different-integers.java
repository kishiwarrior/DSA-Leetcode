class Solution {
    public int subarraysWithKDistinct(int[] nums, int k) {
        return helper(nums,k) - helper(nums,k-1);
    }
    public int helper(int nums[], int k){
        if(k<0) return 0 ; 
        HashMap<Integer,Integer> mpp = new HashMap<>();
        int l = 0 , r = 0 , cnt = 0;
        while(r<nums.length){
            mpp.put(nums[r],mpp.getOrDefault(nums[r],0)+1);
            while(mpp.size()>k){
                mpp.put(nums[l],mpp.getOrDefault(nums[l],0)-1);
                if(mpp.get(nums[l])==0)
                    mpp.remove(nums[l]);
                l=l+1;
            }
            cnt=cnt+r-l+1;
            r++;
        }
        return cnt;
    }
}