class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return fun(nums, target, 0);
    }

    int fun(int[] nums, int target, int i) {

        if (i >= nums.length) {
            return target == 0 ? 1 : 0;
        }

        // Add
        int take = fun(nums, target - nums[i], i + 1);

        // Subtract
        int notTake = fun(nums, target + nums[i], i + 1);

        return take + notTake;
    }
}