class Solution {
    public int threeSumMulti(int[] arr, int target) {
        Arrays.sort(arr);
        long ans = 0;
        int mod = 1000000007;

        for(int i = 0; i < arr.length - 2; i++) {

            int left = i + 1;
            int right = arr.length - 1;

            while(left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if(sum < target) {
                    left++;
                }
                else if(sum > target) {
                    right--;
                }
                else {
                    if(arr[left] != arr[right]){
                        int leftCount = 1;

                        while(left + 1 < right && arr[left] == arr[left+1]){
                            leftCount++;
                            left++;
                        }

                        int rightCount = 1;

                        while(right - 1 > left && arr[right] == arr[right - 1]){
                            rightCount++;
                            right--;
                        }

                        ans += leftCount * rightCount;
                        left++;
                        right--;
                    }else{
                        int n = right- left + 1;
                        ans += (long)n * (n-1)/2;
                        break;
                    }
                }
            }
        }

        return (int)(ans % mod);

        
        
    }
}