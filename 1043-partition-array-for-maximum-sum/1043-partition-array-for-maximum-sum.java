class Solution {
    public int maxSumAfterPartitioning(int[] arr, int k) {
        int dp[][] = new int[arr.length+1][arr.length + 1];

        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }

        return fun(arr, k, 0, 0, arr[0], dp);
        
    }
    int fun(int[] arr, int k, int i, int prev, int max, int[][] dp){
        if(i >= arr.length){
            return 0;
        }
        if(dp[i][prev] != -1){
            return dp[i][prev];
        }

        int len = i - prev + 1;
        int partition = 0;
        int not_partition = 0;

        max = Math.max(arr[i], max);

        if(len == k){
            partition = (max * len)+(fun(arr, k, i + 1, i +1, 0, dp));
        }else{
            partition = (max * len)+(fun(arr, k, i + 1, i + 1, 0, dp));
            not_partition = (fun(arr, k, i + 1, prev, max, dp));
        }

        dp[i][prev] = Math.max(partition, not_partition);

        return dp[i][prev];
    }
}