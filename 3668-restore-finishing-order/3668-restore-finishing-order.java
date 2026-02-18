class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        HashSet<Integer> set = new HashSet<>();
        
        for (int f : friends) {
            set.add(f);
        }

        int[] ans = new int[friends.length];
        int idx = 0;

        for (int i : order) {
            if (set.contains(i)) {
                ans[idx++] = i;
            }
        }

        return ans;
        
    }
}