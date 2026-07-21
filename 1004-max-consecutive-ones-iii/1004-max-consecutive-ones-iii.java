class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zeroes = 0;
        int maxCount = Integer.MIN_VALUE;
        while(r<nums.length)
        {
            if(nums[r] == 0)
            {
                zeroes++;
            }
            if(zeroes > k)
            {
                if(nums[l] == 0)
                {
                    zeroes--;
                }
                l++;
            }
            int length = r - l + 1;
            maxCount = Math.max(maxCount,length);
            r++;
        }
        return maxCount;
        
    }
}