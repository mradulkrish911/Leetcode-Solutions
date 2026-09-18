class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length][nums2.length];
        for(int i = 0 ; i < dp.length; i++){
            Arrays.fill(dp[i], -1);
        }
        return fun(nums1, nums2, 0 , 0, dp);
    }

    int fun(int[] nums1, int[] nums2, int i, int j, int[][] dp){
        if(i == nums1.length || j == nums2.length){
            return 0;
        }
        if(dp[i][j] != -1){
            return dp[i][j];
        }

        if(nums1[i] == nums2[j]){
            return dp[i][j] = 1 + fun(nums1, nums2, i + 1, j + 1, dp);
        }
        
        return dp[i][j] = Math.max(fun(nums1, nums2, i + 1, j,dp), fun(nums1, nums2, i, j + 1, dp));
    }
}