class Solution {
    public int maxArea(int[] height) {
        int l = 0 , r = height.length - 1;
        int cont = 0;
        while (l<r) {
            if ( cont < Math.min(height[l],height[r])*(r-l))
                cont = Math.min(height[l],height[r])*(r-l);
            if ( height[l]<height[r])
                l++;
            else
                r--;
        }
        return cont;
    }
}