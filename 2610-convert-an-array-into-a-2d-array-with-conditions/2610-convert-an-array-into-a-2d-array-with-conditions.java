class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        int[] freq = new int[201];

        for (int num : nums) {

            int row = freq[num];

            if (row == ans.size()) {
                ans.add(new ArrayList<>());
            }

            ans.get(row).add(num);

            freq[num]++;
        }

        return ans;
    }
}