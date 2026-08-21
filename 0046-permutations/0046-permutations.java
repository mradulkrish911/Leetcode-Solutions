class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> input = new ArrayList<>();
        for(int num : nums){
            input.add(num);
        }
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        perm(ans, temp, input);
        return ans;        
    }

    void perm(List<List<Integer>> ans, List<Integer>temp, List<Integer> nums){
        if(nums.size() == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0; i < nums.size(); i++){
            List<Integer> input = new ArrayList<>(nums);
            List<Integer> output = new ArrayList<>(temp);

            output.add(input.get(i));
            input.remove(i);
            perm(ans, output, input);
        }

    }
}