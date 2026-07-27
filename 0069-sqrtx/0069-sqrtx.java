class Solution {
    public int mySqrt(int x) {
        
        int ans=0;
        // for(int i=0;(long)i*i <= x;i++)
        // {
        //     ans = i;
        // }
        // return ans;

        long low = 1;
        long high = x;
        while(low <= high)
        {
            long mid = low + (high - low) / 2;
            long square = mid * mid;
            if(square == x)
            {
                return (int)mid;
            }
            else if(square > x)
            {
                high = mid -1;
            }
            else
            {
                ans = (int)mid;
                low = mid + 1;
            }
        }
        return ans;
    }
}