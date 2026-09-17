class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        ArrayList<Integer>[] al = new ArrayList[26];
        for(int i = 0; i < 26; i++){
            al[i] = new ArrayList<>();
        }

        for(int i = 0; i < s.length(); i++){
            al[s.charAt(i) - 'a'].add(i);
        }

        int count = 0;

        for(int i = 0; i < words.length; i++){
            if(fun(words[i], al, 0, -1)){
                count++;
            }
        }
        return count;
    }
    boolean fun(String word, ArrayList<Integer>[] al, int i, int prev) {
        if(i == word.length()){
            return true;
        }

        ArrayList<Integer> temp = al[word.charAt(i) - 'a'];
        int ans = -1;
        int left = 0;
        int right = temp.size() - 1;

        while(left <= right){
            int mid = left + (right - left)/2;

            if(temp.get(mid) > prev){
                ans = temp.get(mid);
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        if(ans == -1){
            return false;
        }

        return fun(word, al, i + 1, ans);
    }
}