class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> li = new ArrayList<>();

        if(p.length() > s.length()){
            return li;
        }

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        for(char c: p.toCharArray()){
            pCount[c - 'a']++;
        }

        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            sCount[s.charAt(right) - 'a']++;

            if (right - left + 1 > p.length()) {
                sCount[s.charAt(left) - 'a']--;
                left++;
            }
            if (Arrays.equals(pCount, sCount)) {
                li.add(left);
            }
        }

        return li;
                        
    }
}