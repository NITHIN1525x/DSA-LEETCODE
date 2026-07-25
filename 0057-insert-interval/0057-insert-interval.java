class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[] current = newInterval;
        int i = 0;
        List<int[]> ans = new ArrayList<>();
        while(i < intervals.length && intervals[i][1] < current[0])
        {
            ans.add(intervals[i]);
            i++;
        }
        while(i < intervals.length && intervals[i][0] <= current[1])
        {
            int[] next = intervals[i];
            current[0] = Math.min(current[0],next[0]);
            current[1] = Math.max(current[1],next[1]);
            i++;
        }
        ans.add(current);
        while(i < intervals.length)
        {
            ans.add(intervals[i]);
            i++;
        }
        return ans.toArray(new int[ans.size()][]);
    }
}