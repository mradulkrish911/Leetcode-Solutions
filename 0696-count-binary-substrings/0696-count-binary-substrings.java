class Solution {
    public int countBinarySubstrings(String s) {
        int arr[] = new int[s.length()];
        int count = 1;
        int idx = 0;
        int ans = 0;
        
        for(int i = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }else{
                arr[idx++] = count;
                count = 1;
            }
        }
        arr[idx++] = count;

        for(int i = 1; i < arr.length; i++){
            ans += Math.min(arr[i-1], arr[i]);
        }

        return ans;
        
    }
}