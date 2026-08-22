class Solution {
    public boolean isSubsequence(String s, String t) {
       return fun(s , 0 , t , 0);
    }
    boolean fun(String s , int i , String t , int j){

        if( i >= s.length()){
            return true;
        }

        if(j >= t.length()){
            return false;
        }
        if(s.charAt(i) == t.charAt(j)){
            return fun(s , i+1 , t , j+1);
        }
        return fun(s , i , t , j+1);
    }
}