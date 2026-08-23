class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r=0;
        int c=0;
        int max=Integer.MIN_VALUE;
        while(r < nums.length)
        {
            if(nums[r] == 0)
            {
                c++;
            }
            while(c > k)
            {
                if(nums[l] == 0)
                {
                    c--;
                }
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}