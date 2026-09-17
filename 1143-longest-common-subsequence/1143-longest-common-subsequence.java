class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][] dp = new int[text1.length()][text2.length()];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return fun(text1, text2, 0, 0, dp);        
    }
    int fun(String text1, String text2, int i, int j, int[][] dp){
        if(i == text1.length() || j == text2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(text1.charAt(i) == text2.charAt(j)){
            return dp[i][j] = 1 + fun(text1, text2, i + 1, j + 1, dp);
        }
        
        return dp[i][j] = Math.max(fun(text1, text2, i + 1, j, dp), fun(text1, text2, i, j + 1, dp));

    }
}