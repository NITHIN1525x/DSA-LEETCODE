class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atmost(nums,goal) - atmost(nums,goal-1);
    }
    public int atmost(int[] nums,int goal)
    {
        if(goal < 0)
        {
            return 0;
        }
        int c=0;
        int i=0;
        int sum=0;
        for(int j=0;j<nums.length;j++)
        {
            sum += nums[j];
            while(sum > goal)
            {
                sum -= nums[i];
                i++;
            }
            c += j-i+1;
        }
        return c;

    }
}