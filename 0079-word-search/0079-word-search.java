class Solution {
    
     static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public boolean exist(char[][] board, String word) {
        
        //preety hard questions not get it but did it through help
        
         if (board == null || board.length == 0 || word.isEmpty()) {
            return false;
        }

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (search(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
        
    }
    
    private static boolean  search(char[][] board, String word, int i, int j, int idx) {
        if (idx == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] != word.charAt(idx)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = '/';

        for (int[] dir : directions) {
            if (search(board, word, i + dir[0], j + dir[1], idx + 1)) {
                return true;
            }
        }

        board[i][j] = temp;

        return false;
    }
    
}