class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return fun(s1, s2, 0, 0, dp);
    }

    int fun(String s1, String s2, int i, int j, int[][] dp) {
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if (i == s1.length() && j < s2.length()) {
            return s2.charAt(j) + fun(s1, s2, i, j + 1, dp);
        }
        if (j == s2.length() && i < s1.length()) {
            return s1.charAt(i) + fun(s1, s2, i + 1, j, dp);
        }
        if (i == s1.length() && j == s2.length()) {
            return dp[i][j] = 0;
        }
        if (s1.charAt(i) == s2.charAt(j)) {
            return fun(s1, s2, i + 1, j + 1, dp);
        }

        dp[i][j] = Math.min(
            s1.charAt(i) + fun(s1, s2, i + 1, j, dp),
            s2.charAt(j) + fun(s1, s2, i, j + 1, dp)
        );
        return dp[i][j];
    }
}