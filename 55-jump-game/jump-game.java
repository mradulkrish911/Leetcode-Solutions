class Solution {
    public boolean canJump(int[] nums) {
        boolean[] dp = new boolean[nums.length];

        dp[nums.length - 1] = true;

        for(int i = nums.length - 2; i >= 0; i--){
            int far = Math.min(nums.length - 1,i + nums[i]);

            for(int j = i + 1; j <= far; j++){
                if(dp[j]){
                    dp[i] = true;
                    break;
                }
            }
            
        }
        return dp[0];
    }
}