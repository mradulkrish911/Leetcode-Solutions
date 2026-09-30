class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] freq = new int[101];
        int max = 0;;

        for(int i = 0; i < nums.length; i++){
            freq[nums[i]]++;
            if(freq[nums[i]] > max){
                max = freq[nums[i]];
            }
        }

        int[] ans = new int[nums.length];
        int idx = 0;

        for(int i = 0; i < max; i++){
            for(int j = 1; j <= 100; j++){
                if(freq[j] > 0){
                    ans[idx++] = j;
                    freq[j]--;
                }
            }
        }
        return ans;
    }
}