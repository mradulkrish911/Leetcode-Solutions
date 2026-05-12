class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        ArrayList<StringBuilder> al = new ArrayList<>();
        boolean godown = true;
        int row = 0;

        for(int i = 0;i < numRows; i++){
            al.add(new StringBuilder());
        }

        for(int i = 0; i < s.length(); i++){

            al.get(row).append(s.charAt(i));

            if(row == numRows - 1){
                godown = false;                
            }else if(row == 0){
                godown = true;
            }


            if(godown){
                row++;
            }else{
                row--;
            }
        }

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < al.size(); i++){
            ans.append(al.get(i));
        }

        return ans.toString();
    }
}