import java.util.*;

class Solution {
    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();

        for (int[] log : logs) {
            int user = log[0];
            int min = log[1];
            hm.putIfAbsent(user, new HashSet<>());
            hm.get(user).add(min);
        }

        int[] ans = new int[k];

        for (HashSet<Integer> set : hm.values()) {

            int arr = set.size();

            ans[arr - 1]++;
        }

        return ans;
    }
}