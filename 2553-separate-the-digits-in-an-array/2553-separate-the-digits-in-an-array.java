class Solution {
    public int[] separateDigits(int[] nums) {
        
        ArrayList<Integer> al = new ArrayList<>();

        for(int i = 0; i < nums.length; i++){

            Stack<Integer> st = new Stack<>();

            while(nums[i] > 0){
                st.push(nums[i]%10);
                nums[i] /= 10;
            }
            while(!st.isEmpty()){
                al.add(st.pop());
            }
        }
        int[] arr = new int[al.size()];

        for(int i = 0; i < al.size(); i++){
            arr[i] = al.get(i);
        }

        return arr;
    }
}