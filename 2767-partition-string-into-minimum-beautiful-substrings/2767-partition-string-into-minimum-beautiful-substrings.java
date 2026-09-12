class Solution {
    public int minimumBeautifulSubstrings(String s) {
        int ans = fun(s, 0, 0);
        if (ans == Integer.MAX_VALUE) {
            return -1;
        } else {
            return ans + 1;
        }
    }

    int fun(String s, int i, int prev) {
        if (i == s.length() - 1) {
            if (check(s, i, prev)) return 0;
            return Integer.MAX_VALUE;
        }

        int a = Integer.MAX_VALUE;

        if (check(s, i, prev)) {
            int next = fun(s, i + 1, i + 1);

            if (next != Integer.MAX_VALUE) {
                int part = 1 + next;
                a = Math.min(part, a);
            }
        }

        int part = fun(s, i + 1, prev);
        a = Math.min(part, a);

        return a;
    }

    boolean check(String s, int i, int prev) {
        String sub = s.substring(prev, i + 1);

        if (sub.startsWith("0")) return false;

        int x = Integer.parseInt(sub,2);

        while (x > 1 && x % 5 == 0) {
            x /= 5;
        }

        return x == 1;
    }
}