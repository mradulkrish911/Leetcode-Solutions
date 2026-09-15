class Solution {
    public int maxPalindromes(String s, int k) {

        int n = s.length();
        boolean[][] pal = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                if (s.charAt(i) == s.charAt(j) &&
                    (j - i <= 2 || pal[i + 1][j - 1])) {
                    pal[i][j] = true;
                }
            }
        }

        int[] dp = new int[n + 1];
        Arrays.fill(dp, -1);

        return fun(s, k, 0, dp, pal);
    }

    int fun(String s, int k, int start,
            int[] dp, boolean[][] pal) {

        if (start >= s.length())
            return 0;

        if (dp[start] != -1)
            return dp[start];

        int ans = fun(s, k, start + 1, dp, pal);

        for (int end = start + k - 1; end < s.length(); end++) {

            if (pal[start][end]) {
                ans = Math.max(
                    ans,
                    1 + fun(s, k, end + 1, dp, pal)
                );
            }
        }

        return dp[start] = ans;
    }
}