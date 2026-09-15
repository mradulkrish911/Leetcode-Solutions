class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        HashMap<String, Integer> dp = new HashMap<>();
        return fun(nums, target, 0, dp);
    }

    int fun(int[] nums, int target, int i, HashMap<String, Integer> dp) {

        if (i >= nums.length) {
            return target == 0 ? 1 : 0;
        }

        String key = i + "," + target;

        if (dp.containsKey(key))
            return dp.get(key);

        // Add
        int take = fun(nums, target - nums[i], i + 1, dp);

        // Subtract
        int not_take = fun(nums, target + nums[i], i + 1, dp);

        dp.put(key, take + not_take);

        return take + not_take;
    }
}