class Solution {
    public int missingMultiple(int[] nums, int k) {

        HashSet<Integer> hs = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        boolean found = true;
        int i = 1;
        int ans = 0;
        while(found){
            if(hs.contains(k * i)){
                i++;
                
            }else{
                ans = k * i; 
                found = false;               
            }
        }

        return ans;
        
    }
}