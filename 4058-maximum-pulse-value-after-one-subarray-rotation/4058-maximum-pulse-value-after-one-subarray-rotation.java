class Solution {
    public long maxValue(int[] nums) {
        //I want max values at positive places and least at the negative.
        int[] arr= new int[nums.length];

        long sum = 0;
        long chasum = 0;
        long bestsum = 0;
        long even = 0;
        long odd = Long.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(i %2 == 0){
                sum += nums[i];
            }else{
                sum -= nums[i];
            }

            if(i % 2 == 0){
                chasum -= nums[i];
            }else{
                chasum +=nums[i];
            }

            int sign = (i + 1)% 2;
            if(sign == 0){
                bestsum = Math.max(bestsum, 2* (chasum - even));
                even = Math.min(even,chasum);
            }else{
                if(odd != Long.MAX_VALUE){
                    bestsum = Math.max(bestsum, 2*(chasum - odd));
                }
                odd = Math.min(odd, chasum);            
            }
        }
        return sum + bestsum;        
        
    }
}