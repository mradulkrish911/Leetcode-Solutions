class Solution {

    void func(List<Integer> nums, List<Integer> temp, List<List<Integer>> ans) {
        ans.add(new ArrayList<>(temp));

        if (nums.size() == 0) return;

        for (int i = 0; i < nums.size(); i++) {
            List<Integer> ip = new ArrayList<>(nums);
            List<Integer> op = new ArrayList<>(temp);

            op.add(nums.get(i));
            ip.subList(0, i + 1).clear();

            func(ip, op, ans);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> input = new ArrayList<>();
        for (int num : nums) {
            input.add(num);
        }

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();

        func(input, temp, ans);

        return ans;
    }
}