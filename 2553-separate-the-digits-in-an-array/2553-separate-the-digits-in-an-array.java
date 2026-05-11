class Solution {
    public int[] separateDigits(int[] nums) {

        ArrayList<Integer> al = new ArrayList<>();

        for(int num : nums){

            String s = Integer.toString(num);

            for(char ch : s.toCharArray()){
                al.add(ch - '0');
            }
        }

        int[] ans = new int[al.size()];

        for(int i = 0; i < al.size(); i++){
            ans[i] = al.get(i);
        }

        return ans;
    }
}