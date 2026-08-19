class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        parts(s, new ArrayList<>(), ans);
        return ans;
    }

    public boolean isPalin(String s, int i) {
        if(i >= s.length() / 2) {
            return true;
        }

        if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
            return false;
        }

        return isPalin(s, i + 1);
    }

    public List<List<String>> parts(String s, List<String> curr,List<List<String>> ans) {

        if(s.length() == 0) {
            ans.add(new ArrayList<>(curr));
            return ans;
        }

        for(int i = 0; i < s.length(); i++) {

            String temp = s.substring(0, i + 1);

            if(isPalin(temp, 0)) {
                curr.add(temp);
                parts(s.substring(i + 1), curr, ans);
                curr.remove(curr.size() - 1);
            }
        }

        return ans;
    }
}