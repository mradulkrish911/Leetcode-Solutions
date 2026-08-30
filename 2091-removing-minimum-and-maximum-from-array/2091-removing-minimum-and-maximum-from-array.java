class Solution {
    public int minimumDeletions(int[] nums) {
        minMax(nums,0);

        int onleft = Math.max(minid, maxid) + 1;
        int onright = nums.length - Math.min(minid, maxid);
        int both1 = minid + 1 +(nums.length - maxid);
        int both2 = maxid + 1 +(nums.length - minid);

        return Math.min(Math.min(onleft, onright), Math.min(both1, both2));
    }
    int minid = 0;
    int maxid = 0;
    void minMax(int[] nums, int i){
        if(i == nums.length)return;
        if(nums[i] < nums[minid]){
            minid = i;
        }
        if(nums[i] > nums[maxid]){
            maxid = i;
        }
        minMax(nums, i + 1);

    }
}