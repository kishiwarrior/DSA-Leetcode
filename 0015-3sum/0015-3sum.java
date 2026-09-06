class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0 ; i < nums.length-2; i++) {
            if(i>0 && nums[i-1]==nums[i])
            continue;
            int curr = i;
            int target = -nums[i];
            int l = curr+1, r = nums.length - 1;
            while ( l<r ) {
                if ( nums[l] + nums[r] == target ) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    
                    // Skip duplicates to prevent duplicate triplets
                    while (l < r && nums[l] == nums[l - 1]) l++;
                    while (l < r && nums[r] == nums[r + 1]) r--;
                }
                else if ( nums[l] + nums[r] < target )
                    l++;
                else 
                    r--;
        }
        }
        return res;
    }
}