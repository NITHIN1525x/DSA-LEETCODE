class Solution {
    public int firstMissingPositive(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int x=1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == x)
            {
                x++;
            }
        }
        return x;
    }
}