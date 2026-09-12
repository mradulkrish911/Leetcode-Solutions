class Solution {
    public int tribonacci(int n) {
        int[] dp = new int[n + 1];
        return fun(n, dp);
        
    }
    int fun(int n, int[] dp){
        if(n == 0)return 0;
        if(n == 1 || n == 2){
            return 1;
        }

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = fun(n-1, dp) + fun(n-2, dp) + fun(n-3, dp);

        return dp[n];
    }
}