class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> ans = new ArrayList<>();
        int i =0;
        int j=0;
        while(i < firstList.length && j < secondList.length)
        {
            int[] current = firstList[i];
            int[] next = secondList[j];
            if(next[0] <= current[1] && current[0] <= next[1])
            {
                int start = Math.max(current[0],next[0]);
                int end = Math.min(current[1],next[1]);
                ans.add(new int[]{start,end});
            }
            if(current[1] < next[1])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        return ans.toArray(new int[ans.size()][]);
    }
}