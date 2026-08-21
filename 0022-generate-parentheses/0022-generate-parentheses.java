class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> li = new ArrayList<>();
        gen(n, "", 0, 0, li);
        return li;
    }

    void gen(int n, String s, int open, int close, List<String> li){
        if(close > open)return;
        if(open > n || close > n)return;

        if(open + close == 2 * n){
            li.add(s);
            return;
        }
        gen(n, s + "(", open + 1, close, li);
        
        gen(n, s + ")", open , close + 1, li);                
    }
}