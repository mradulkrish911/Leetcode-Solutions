class Solution {
    public int fib(int n) {
        int dp[] = new int[n+1];
        return fun(n, dp);

    }
    int fun(int n, int[] dp){
        if(n <= 1)return n;

        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] = fun(n-1, dp) + fun(n-2, dp);

        return dp[n];        
    }
}