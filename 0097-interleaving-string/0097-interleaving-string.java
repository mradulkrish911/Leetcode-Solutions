class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()){
            return false;
        }
        Boolean[][] dp = new Boolean[s1.length() + 1][s2.length() + 1];
        
        return fun(s1, s2, s3, 0 , 0, 0, dp);
        
    }
    boolean fun(String s1, String s2, String s3, int i, int j, int idx, Boolean[][] dp){
        if(idx == s3.length()){
            return true;
        }

        if(dp[i][j] != null){
            return dp[i][j];
        }

        if(i == s1.length()){
            if(s2.charAt(j) == s3.charAt(idx)){
                return dp[i][j] = fun(s1, s2, s3, i, j + 1, idx + 1,dp);
            }else{
                return dp[i][j] = false;
            }
        }

        if(j == s2.length()){
            if(s1.charAt(i) == s3.charAt(idx)){
                return dp[i][j] = fun(s1, s2, s3, i + 1, j, idx + 1,dp);
            }else{
                return dp[i][j] =  false;
            }
        }

        boolean b1 = false;
        boolean b2 = false;

        if(s1.charAt(i) == s3.charAt(idx)){
            b1 = fun(s1, s2, s3, i + 1, j, idx + 1, dp);
        }
        if(s2.charAt(j) == s3.charAt(idx)){
            b2 = fun(s1, s2, s3, i, j + 1, idx + 1,dp);
        }

        return dp[i][j] = b1 || b2;
    }
}
