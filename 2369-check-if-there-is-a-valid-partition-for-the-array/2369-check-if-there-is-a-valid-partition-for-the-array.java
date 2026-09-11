class Solution {
    public boolean validPartition(int[] nums) {
        Boolean dp[] = new Boolean[nums.length];
        return fun(nums, 0, dp);
    }

    boolean fun(int[] arr, int i, Boolean[] dp) {

        if (i == arr.length) {
            return true;
        }

        if(dp[i] != null){
            return dp[i];
        }

        if (i + 1 < arr.length && arr[i] == arr[i + 1]) {
            if (fun(arr, i + 2, dp)) {
                dp[i] = true;
                return dp[i];
            }
        }

        if (i + 2 < arr.length && arr[i] == arr[i + 1] && arr[i] == arr[i + 2]) {
            if (fun(arr, i + 3, dp)) {
                dp[i] = true;
                return dp[i];
            }
        }

        if (i + 2 < arr.length && arr[i] + 1 == arr[i + 1] && arr[i + 1] + 1 == arr[i + 2]) {
            if (fun(arr, i + 3, dp)) {
                dp[i] = true;
                return dp[i];
            }
        }

        return dp[i] = false;
    }
}