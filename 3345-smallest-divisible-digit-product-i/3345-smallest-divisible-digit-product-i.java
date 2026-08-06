class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int ans = 1;
            int num = n;

            while(num>0){
                ans *= num % 10;
                num/=10;
            }
            if(ans % t == 0){
                return n;
            }
            n++;
        }

    }
}