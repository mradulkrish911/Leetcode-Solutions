class Solution {
    public int maxPower(String s) {
        if(s.length() == 1)return 1;
        int low = 0;
        int high = 1;
        int ans = 0;

        while(high < s.length()){
            if(s.charAt(low) == s.charAt(high)){
                high++;
            }else{
                low = high;
                high++;
            }
            ans = Math.max(ans, high - low);
        }

        return ans;
    }
}