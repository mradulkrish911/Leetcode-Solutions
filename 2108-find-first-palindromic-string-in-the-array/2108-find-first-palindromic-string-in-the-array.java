class Solution {
    public String firstPalindrome(String[] words) {
        for(int i =0; i < words.length; i++){
            String s = words[i];
            if(isPalin(words[i])){
                return s;
            }

        }
        return "";
        
    }
    boolean isPalin(String s) {
    int start = 0;
    int end = s.length() - 1;

    while (start < end) {
        if (s.charAt(start++) != s.charAt(end--))
            return false;
    }

    return true;
}
}