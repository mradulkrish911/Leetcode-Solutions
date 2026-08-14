class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()){
            char ch = s.charAt(right);
            map.put(ch, map.getOrDefault(ch, 0) + 1);

            while(map.get(ch) > 2){
                char remove = s.charAt(left);
                map.put(remove, map.get(remove) - 1);
                left = left + 1;
            }
            max = Math.max(max, right - left + 1);
            right = right + 1;
        }
        return max;
        
    }
}