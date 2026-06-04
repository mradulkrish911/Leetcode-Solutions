class Solution {
    public int totalWaviness(int num1, int num2) {

        int total = 0;

        for (int n = num1; n <= num2; n++) {

            String str = n + "";

            for (int i = 1; i < str.length() - 1; i++) {

                int left = str.charAt(i - 1) - '0';
                int mid = str.charAt(i) - '0';
                int right = str.charAt(i + 1) - '0';

                if ((mid > left && mid > right) ||
                    (mid < left && mid < right)) {
                    total++;
                }
            }
        }

        return total;
    }
}