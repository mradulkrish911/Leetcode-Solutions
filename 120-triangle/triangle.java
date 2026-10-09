class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        for(int i = 0; i < dp.length; i++){
            Arrays.fill(dp[i], Integer.MIN_VALUE);
        }
        return fun(triangle, 0, 0, dp);
    }
    int fun(List<List<Integer>> triangle, int i, int j, int[][] dp){
        if(i == triangle.size() - 1){
            return triangle.get(i).get(j);
        }
        if(dp[i][j] != Integer.MIN_VALUE){
            return dp[i][j];
        }

        int down = fun(triangle, i + 1, j, dp);
        int downright = fun(triangle, i + 1, j + 1, dp);

        return dp[i][j] = triangle.get(i).get(j) + Math.min(down, downright);
    }
}
