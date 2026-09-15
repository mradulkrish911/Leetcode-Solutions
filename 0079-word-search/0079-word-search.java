class Solution {

    public boolean exist(char[][] board, String word) {

        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {

                if (fun(board, word, row, col, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    boolean fun(char[][] board, String word, int row, int col, int i) {

        if (row < 0 || col < 0 ||
            row >= board.length || col >= board[0].length ||
            board[row][col] != word.charAt(i)) {
            return false;
        }

        if (i == word.length() - 1) {
            return true;
        }

        char temp = board[row][col];
        board[row][col] = '#';

        boolean ans =
            fun(board, word, row + 1, col, i + 1) || fun(board, word, row - 1, col, i + 1) ||fun(board, word, row, col + 1, i + 1) ||fun(board, word, row, col - 1, i + 1);

        board[row][col] = temp;

        return ans;
    }
}