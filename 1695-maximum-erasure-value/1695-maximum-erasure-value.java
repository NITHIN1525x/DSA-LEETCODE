class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i=0;
        int j=0;
        int sum=0;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> set = new HashSet<>();
        while(j < nums.length)
        {
            while(set.contains(nums[j]))
            {
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            set.add(nums[j]);
            sum += nums[j];
            max = Math.max(max,sum);
            j++;
        }
        return max;
    }
}