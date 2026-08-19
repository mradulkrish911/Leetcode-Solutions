class Solution {
    public void reverse(char[] ch, int i){
        if (i >= ch.length / 2) {
            return;
        }

        char temp = ch[ch.length - 1 - i];
        ch[ch.length - 1 -i] = ch[i];
        ch[i] = temp;

        reverse(ch, i + 1);     

    }
    public void reverseString(char[] s) {
        reverse(s, 0);
        
    }
}