class Solution {
    public long countCommas(long n) {
        long arr[] = new long[6];
        arr[0] = 0;
        arr[1] = 1000;
        arr[2] = 1000000;
        arr[3] = 1000000000;
        arr[4] = 1000000000000L;
        arr[5] = 1000000000000000L;
        
        return fun(arr, 1, n);
        
    }
    long fun(long arr[], int i, long n){
        if(i >= 6 || arr[i] > n)return 0;
        if(i + 1 < 6 && n >= arr[i + 1]){
            return fun(arr, i + 1, n) + (arr[i + 1] - arr[i])* i;
        }
        return (n - arr[i] + 1) * i;
    }
}