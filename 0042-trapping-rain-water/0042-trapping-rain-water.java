class Solution {
    public int trap(int[] height) {
        int totalWater=0;
        int left =0;
        int right = height.length - 1;
        int leftmax = height[left];
        int rightmax = height[right];
        while(left < right)
        {
            
            if(leftmax < rightmax)
            {
                left++;
                leftmax = Math.max(leftmax,height[left]);
                totalWater += leftmax - height[left];
            }
            else
            {
                right--;
                rightmax = Math.max(rightmax,height[right]);
                totalWater += rightmax - height[right];
            }
        }
        return totalWater;
    }
}