class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minlen = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        while(r < nums.length)
        {
            sum = sum + nums[r];
            while(sum >= target)
            {
                int length = r - l + 1;
                minlen = Math.min(minlen, length);
                sum = sum - nums[l];
                l++;
            }
            r++;
        }
        if(minlen == Integer.MAX_VALUE)
        {
            return 0;
        }
        else
        {
            return minlen;
        }
    }
}