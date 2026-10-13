class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) nums[i] * nums[i];
        }
        Arrays.sort(arr);
        long ans = 0;
        int mid = (n + 1) / 2;
        for (int i = 0; i < n; i++) {
            if (i < mid) ans += arr[n - 1 - i];
            else ans -= arr[n - 1 - i];
        }
        return ans;
    }
}