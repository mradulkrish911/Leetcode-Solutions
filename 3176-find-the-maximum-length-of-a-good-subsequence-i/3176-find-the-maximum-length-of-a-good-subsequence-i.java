class Solution {
    public int maximumLength(int[] nums, int k) {
        int n = nums.length;
        int[][][] dp = new int[n][n + 1][k + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                Arrays.fill(dp[i][j], -1);
            }
        }
        return fun(nums, k, 0, -1, dp);
    }

    int fun(int[] nums, int k, int i, int prev, int[][][] dp) {
        if (i == nums.length) {
            return 0;
        }

        if (dp[i][prev + 1][k] != -1) {
            return dp[i][prev + 1][k];
        }
        int not_take = fun(nums, k, i + 1, prev, dp);
        int take = 0;

        if (prev == -1 || nums[prev] == nums[i]) {
            take = 1 + fun(nums, k, i + 1, i, dp);
        } else if (k > 0) {
            take = 1 + fun(nums, k - 1, i + 1, i, dp);
        }

        return dp[i][prev + 1][k] = Math.max(take, not_take);
    }
}