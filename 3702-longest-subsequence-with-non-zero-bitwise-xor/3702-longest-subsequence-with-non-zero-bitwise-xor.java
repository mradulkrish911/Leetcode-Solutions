class Solution {
    public int longestSubsequence(int[] nums) {
        int x = 0;
        boolean nz = false;

        for (int i = 0; i < nums.length; i++) {
            x ^= nums[i];

            if (nums[i] != 0) {
                nz = true;
            }
        }

        if (x != 0) {
            return nums.length;
        }

        if (nz) {
            return nums.length - 1;
        }

        return 0;
    }
}