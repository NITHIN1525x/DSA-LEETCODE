class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int water = 0;

 
        int length;
        while(left < right)
        {
            
            int h = Math.min(height[left],height[right]);
            length = right - left;
            int currentWater = h * length;
            water = Math.max(water,currentWater);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }

        }
        return water;
    }
}