class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(0,candidates,target,0,new ArrayList<>());
        return result;
    }
    public void backtrack(int index,int[] candidates,int target,int sum, List<Integer> current)
    {
        if(sum == target)
        {
            result.add(new ArrayList<>(current));
            return;
        }
        if(sum > target)
        {
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            current.add(candidates[i]);
            backtrack(i,candidates,target,sum + candidates[i],current);
            current.remove(current.size() -1);
        }
        
    }
}