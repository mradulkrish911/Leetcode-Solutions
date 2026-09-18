class Solution {
    public int lengthOfLIS(int[] nums) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        for(int i = 0; i < nums.length; i++){
            if(al.isEmpty() || nums[i] > al.get(al.size() - 1)){
                al.add(nums[i]);
            }else{
                int idx = 0;
                while(al.get(idx) < nums[i]){
                    idx++;
                }
                al.set(idx, nums[i]);
            }
        }
        return al.size();
    }
}