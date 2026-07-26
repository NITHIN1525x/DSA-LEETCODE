class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        int[] current = intervals[0];
        int count = 0;
        for(int i=1;i<intervals.length;i++)
        {
            int[] next = intervals[i];
            if(next[0] < current[1])
            {
                count++;
                if(next[1] < current[1]) // removing the value which is more in next[1] and current [1] 
                {
                    current = next;
                }
            }
            else
            {
                current = next;
            }
        }
        return count;
    }
}