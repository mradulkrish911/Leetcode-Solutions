class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<Integer> input = new ArrayList<>();
        for(int num: nums){
            input.add(num);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();

        perm(ans, temp, input);
        return ans;        
    }
    void perm(List<List<Integer>> ans, List<Integer> temp, List<Integer> nums){

        if(nums.size() == 0){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i = 0;i < nums.size(); i++){
            if(i > 0 && nums.get(i).equals(nums.get(i-1))){ 
                continue; 
            }

            List<Integer> ip = new ArrayList<>(nums); 
            List<Integer> op = new ArrayList<>(temp);

            op.add(ip.get(i));
            ip.remove(i);
            perm(ans, op, ip);

        }
    }
}