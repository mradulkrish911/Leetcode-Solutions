class Solution {
    public int rob(int[] nums) {
        int[][] dp = new int[101][101];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        int ap1 = fun(nums, 0, nums.length - 2, dp);
        int ap2 = fun(nums, 1, nums.length - 1, dp);

        return Math.max(ap1, ap2);
    }

    int fun(int[] nums, int i, int j, int[][] dp) {
        if (i > j){
            return 0;
        }
        if(i == j)return nums[i];
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int rob = nums[i] + fun(nums, i + 2, j, dp);
        int skip = fun(nums, i + 1, j, dp);

        return dp[i][j] = Math.max(rob, skip);
    }
}