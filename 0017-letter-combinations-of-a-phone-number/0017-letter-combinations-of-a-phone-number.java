class Solution {
    Map<Integer, String> map = new HashMap<>();

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");

        func(0, digits, "", ans, map);

        return ans;
    }

    void func(int i, String digits, String temp, List<String> ans, Map<Integer, String> map) {
        if (i == digits.length()) {
            ans.add(temp);
            return;
        }

        int curr = digits.charAt(i) - '0';
        String str = map.get(curr);

        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);
            func(i + 1, digits, temp + ch, ans, map); 
            
                       
        }
    }
}