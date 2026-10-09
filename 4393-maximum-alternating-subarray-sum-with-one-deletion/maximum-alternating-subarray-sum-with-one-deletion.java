class Solution {
    public long maxAlternatingSum(int[] nums) {
        Long [][][][] dp = new Long[nums.length][2][2][2];
        return func(nums,0,0,'+',0,dp);    
    }
    long func(int[] nums,int i,int delete,char sign,int start,Long[][][][]dp){ 
        if(i >= nums.length){
            if(start == 1)
            return 0;
        
        return Long.MIN_VALUE;
        }

        int s;
        if(sign == '+')
        s=0;
        else
        s=1;

        if(dp[i][delete][s][start] != null)
        return dp[i][delete][s][start];

        if(start == 0){
            long skip = func(nums,i+1,0,'+',0,dp);
            long started;
            if(sign == '+')
            started = nums[i] + Math.max(0,func(nums,i+1,delete,'-',1,dp));
            else
            started = -nums[i] + Math.max(0,func(nums,i+1,delete,'+',1,dp));
            return dp[i][delete][s][start] = Math.max(skip,started);
        }

        long choice1;
        if(sign == '+')
        choice1 = nums[i] + Math.max(0,func(nums,i+1,delete,'-',1,dp));
        else
        choice1 = -nums[i]+Math.max(0,func(nums,i+1,delete,'+',1,dp));

        long choice2 = choice1;
        if(delete == 0){
            choice2 = Math.max(choice1,func(nums,i+1,1,sign,1,dp));
        }
        return dp[i][delete][s][start] = choice2;
    }
}