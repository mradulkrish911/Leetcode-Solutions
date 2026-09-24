class Solution {
    public int minDistance(String word1, String word2) {
        int[][] dp = new int[word1.length()][word2.length()];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        int num = fun(word1, word2, 0, 0, dp);
        int ans = (word1.length() - num) + (word2.length() - num);
        return ans;
        
    }
    int fun(String word1, String word2, int i, int j, int[][] dp){
        if(i == word1.length() || j == word2.length()){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if(word1.charAt(i) == word2.charAt(j)){
            return dp[i][j] = 1 + fun(word1, word2, i + 1, j + 1, dp);
        }
        
        return dp[i][j] = Math.max(fun(word1, word2, i + 1, j, dp), fun(word1, word2, i, j + 1, dp));

    }
}