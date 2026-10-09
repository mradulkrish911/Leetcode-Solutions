class Solution {
public int minFallingPathSum(int[][] matrix) {
        int[][] dp = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < dp.length; i++) {
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }

        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            ans = Math.min(ans, fun(matrix, 0, i, dp));
        }

        return ans;
    }
    int fun(int[][] matrix, int i, int j, int[][] dp) {
        if (j < 0 || j >= matrix[0].length) {
            return Integer.MAX_VALUE;
        }
        if (i == matrix.length - 1) {
            return matrix[i][j];
        }
        if (dp[i][j] != Integer.MIN_VALUE) {
            return dp[i][j];
        }

        int down = fun(matrix, i + 1, j, dp);
        int downleft = fun(matrix, i + 1, j - 1, dp);
        int downright = fun(matrix, i + 1, j + 1, dp);

        return dp[i][j] = matrix[i][j] + Math.min(down, Math.min(downleft, downright));
    }
}
