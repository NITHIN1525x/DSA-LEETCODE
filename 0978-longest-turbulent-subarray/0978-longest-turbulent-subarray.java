class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l=0;
        int r=1;
        int maxi = 1;
        while(r < arr.length)
        {
            if(arr[r] == arr[r-1])
            {
                l = r;
            }
            else if(r == 1 || (arr[r] > arr[r-1]) != (arr[r-1] > arr[r-2]))
            {
                maxi = Math.max(maxi,r-l+1);
            }
            else
            {
                l = r-1;
            }
            r++;
        }
        return maxi;
    }
}