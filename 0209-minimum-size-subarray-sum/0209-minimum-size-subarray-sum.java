class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0;
        int r=0;
        int mini = Integer.MAX_VALUE;
        int sum=0;
        while(r<nums.length)
        {
            sum += nums[r];
            while(sum >= target)
            {
                mini = Math.min(mini,r-l+1);
                sum -= nums[l];
                l++;
            }
            
            r++;
        }
        if(mini == Integer.MAX_VALUE)
        {
            return 0;
        }
        return mini;
    }
}