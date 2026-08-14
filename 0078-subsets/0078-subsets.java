class Solution {

    void func(List<Integer> nums, List<Integer> op, List<List<Integer>> ans, int i) {
        if (i >= nums.size()){
            ans.add(new ArrayList<>(op));
            return;
        } 
        op.add(nums.get(i));
        func(nums, op, ans, i + 1);
        op.remove(op.size() - 1);
        func(nums, op, ans, i + 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> input = new ArrayList<>();
        for (int num : nums) {
            input.add(num);
        }

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        func(input, temp, ans, 0);

        return ans;
    }
}