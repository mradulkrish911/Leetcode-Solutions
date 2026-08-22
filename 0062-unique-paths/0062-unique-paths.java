import java.math.BigInteger;

class Solution {
    public int uniquePaths(int m, int n) {
        BigInteger a = factorial(m + n - 2);
        BigInteger b = factorial(n - 1);
        BigInteger c = factorial(m - 1);

        return a.divide(b.multiply(c)).intValue();
    }

    BigInteger factorial(int n) {
        if (n <= 0)
            return BigInteger.ONE;

        return BigInteger.valueOf(n).multiply(factorial(n - 1));
    }
}