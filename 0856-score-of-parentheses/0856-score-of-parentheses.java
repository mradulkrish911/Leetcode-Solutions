class Solution {
    public int scoreOfParentheses(String s) {
    Stack<Integer> stack = new Stack<>();
    stack.push(0);

    for(char ch : s.toCharArray()){
        if(ch == '('){
            stack.push(0);
        }
        else{
            int first = stack.pop();
            int second = stack.pop();
            stack.push(second + Math.max(2 * first,1));
        }
    }
    return stack.pop();    
    }
}