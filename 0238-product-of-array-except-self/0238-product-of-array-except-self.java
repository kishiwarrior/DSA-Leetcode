class Solution {
    public int[] productExceptSelf(int[] nums) {
        int p[] = new int[nums.length];
        int s[] = new int[nums.length];
        p[0] = nums[0]; 
        s[nums.length-1] = nums[nums.length-1];
        for (int i = 1 ; i < p.length; i++) {
            p[i] = nums[i] * p[i-1];
        }
        for (int i = s.length-2 ; i >= 0; i--) {
            s[i] = s[i+1] * nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if(i==0)
                nums[i] = s[i+1];
            else if(i==nums.length-1)
                nums[i] = p[i-1];
            else
                nums[i] = p[i-1]*s[i+1];
        }
        return nums;

    }
}