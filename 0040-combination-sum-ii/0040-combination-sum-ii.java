class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        sum(ans, temp, candidates, target, 0);

        return ans;
    }

    void sum(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int target, int idx){
        if(target == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = idx; i < candidates.length; i++){
            
            if(i > idx && candidates[i] == candidates[i - 1] ){
                continue;
            }

            if(candidates[i] > target){
                break;
            }

            temp.add(candidates[i]);
            sum(ans, temp, candidates, target - candidates[i], i + 1);

            temp.remove(temp.size() - 1);
        }
        
    }
}