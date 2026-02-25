class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor ^= nums[i];
        }

        int a = 0;
        int b = 0;
        // xor resulting in a ^ b, now what to do.

        int mask = xor & (-xor);

        for(int i = 0; i < nums.length; i++){
            if((mask & nums[i]) != 0){
                a ^= nums[i];
            }else{
                b ^= nums[i];
            }
        }

        return new int[]{a,b};
        
    }
}