class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        sum(ans, temp, candidates, target, 0);

        return ans;
        
    }
    void sum(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int i){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        if(i == candidates.length || target < 0){
            return;
        } 
        temp.add(candidates[i]);
        sum(ans, temp, candidates, target - candidates[i], i);
        temp.remove(temp.size() - 1);
        sum(ans, temp, candidates, target, i + 1);
        
    }
}