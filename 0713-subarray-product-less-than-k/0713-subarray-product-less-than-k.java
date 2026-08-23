class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l=0;
        int r=0;
        int product =1;
        int c=0;
        if( k<=1)
        {
            return 0;
        }
        while(r<nums.length)
        {
            product *= nums[r];
            
            while(product >= k)
            {
                product /= nums[l];
                l++;
            }
            c += r-l+1;
            r++;
        }
        return c;
    }
}