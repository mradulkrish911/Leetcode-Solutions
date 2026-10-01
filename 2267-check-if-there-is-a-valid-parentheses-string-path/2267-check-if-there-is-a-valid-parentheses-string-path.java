class Solution {
    int fun(int i, int j, int num, char[][] grid, int[][][] dp) {

        if (i >= grid.length || j >= grid[0].length || num < 0) return 0;        
        
        if (grid[i][j] == '('){
            num++;
        }else{
            num--;
        }

        if (num < 0 || num > (grid.length + grid[0].length) / 2){
            return 0;
        }

        if (i == grid.length - 1 && j == grid[0].length - 1){
            if (num == 0){
                return 1;
            }else{
                return 0;
            }
        }
        if(dp[i][j][num] != -1){
            return dp[i][j][num];
        }

        int a = fun(i + 1, j, num, grid, dp);
        int b = fun(i, j + 1, num, grid, dp);

        return dp[i][j][num] = a | b;
    }

    public boolean hasValidPath(char[][] grid) {
        int[][][] dp = new int[101][101][101];
        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){
                Arrays.fill(dp[i][j], -1);
            }
        }
        if(fun(0, 0, 0, grid, dp) == 1){
            return true;
        }else{
            return false;
        }
    }
}