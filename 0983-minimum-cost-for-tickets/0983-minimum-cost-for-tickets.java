class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        int dp[] = new int[days.length];
        Arrays.fill(dp, -1);
        return fun(0, days, costs, dp);
        
    }
    int fun(int i, int[] days, int[] costs, int[] dp){
        if(i >= days.length){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int one = costs[0] + fun(i + 1, days, costs,dp);

        int j = i;
        while(j < days.length && days[j] < days[i] + 7){
            j++;            
        }
        int seven = costs[1] + fun(j, days, costs, dp);

        int k = i;
        while(k < days.length && days[k] < days[i] + 30){
            k++;
        }
        int thirty = costs[2] + fun(k, days, costs, dp);

        dp[i] = Math.min(one, Math.min(seven, thirty));

        return dp[i];       
        
    }
}