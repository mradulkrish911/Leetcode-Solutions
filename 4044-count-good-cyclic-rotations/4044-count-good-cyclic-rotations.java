class Solution {
    public int countGoodRotations(int[] nums) {
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum+= nums[i];            
        }
        long midsum = 0;
        int mid = nums.length/2;
        for(int i = 0; i < mid; i++){
            midsum+=nums[i];            
        }
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            if(midsum > sum - midsum){
                ans++;
            }
            midsum -= nums[i];
            midsum += nums[(i + mid) % nums.length];
        }
        return ans;
    }
}