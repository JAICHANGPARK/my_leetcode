class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] b = new boolean[9];
        
        //rule의 종류 , 가로, 세로 ,섭그리드
        for(int i =0 ; i < 3; i++){
            for(int j = 0; j < 9; j++){
                Arrays.fill(b, false);
                for(int k = 0; k < 9; k++){
                    if(i ==0){
                        //가로
                        
                        if(board[j][k] == '.') continue;
                        
                        int val = Character.getNumericValue(board[j][k]);
                        
                        if(b[val-1]) return false;
                        
                        b[val-1] = true;
                    
                    } else if(i == 1){
                        //세로
                    
                        if(board[k][j] == '.') continue;
                        
                        int val = Character.getNumericValue(board[k][j]);
                        
                        if(b[val-1]) return false;
                        
                        b[val-1] = true;
                        
                        
                    } else{
                        //섭그리드 
                        char cur = board[j/3 * 3 + k/3][j % 3 * 3 + k % 3];
                        if(cur == '.') continue;
                        
                        int val = Character.getNumericValue(cur);
                        
                        if(b[val-1]) return false;
                        
                        b[val-1] = true;
                    }
                    
                }
            }
        }
        return true;
    }
}
