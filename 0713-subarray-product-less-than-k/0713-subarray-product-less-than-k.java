class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        if(k <= 1)
        {
            return 0;
        }
        int l = 0;
        
        int product = 1;
        for(int r = 0;r<n;r++)
        {
            product *= nums[r];
            while(product >= k)
            {
                product /= nums[l];
                l++;
            }
            count += r-l+1;
        }
        return count;
    }
}