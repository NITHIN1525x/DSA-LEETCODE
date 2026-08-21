// class Solution {
//     public int numSubarrayBoundedMax(int[] nums, int left, int right) {
//         // int c=0;
//         // int i=0;

        
//         // while(i < nums.length)
//         // {
//         //     int max = 0;
//         //     for(int j=i;j<nums.length;j++)
//         //     {
//         //         max = Math.max(max,nums[j]);
//         //         if(max >= left && max <= right)
//         //         {
//         //             c++;
//         //         }
//         //         if(max > right)
//         //         {
//         //             break;
//         //         }
//         //     }
//         //     i++;  
//         // }
//         // return c;

        
//     }
// }

class Solution {

    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        return count(nums,right) - count(nums,left-1);        
    }
    public int count(int[] nums,int limit)
    {
        int ans=0;
        int len = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] <= limit)
            {
                len++;
            }
            else
            {
                len=0;
            }
            ans += len;
        }
        return ans;
    }
}
