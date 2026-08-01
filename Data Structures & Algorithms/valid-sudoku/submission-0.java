class Solution {
    public boolean isValidSudoku(char[][] board) {
        //for row checking
        for(int i=0;i<board.length;i++){
            HashSet<Character> st = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='.'){
                    continue;
                }
                else if(!st.contains(board[i][j])){
                    st.add(board[i][j]);
                }
                else{
                    return false;
                }
            }
        }

        //for column checking
        for(int i=0;i<board.length;i++){
            HashSet<Character> st = new HashSet<>();
            for(int j=0;j<board.length;j++){
                if(board[j][i]=='.'){
                    continue;
                }
                else if(!st.contains(board[j][i])){
                    st.add(board[j][i]);
                }
                else{
                    return false;
                }
            }
        }

        //for grid checking
        for(int rowblock=0;rowblock<board.length;rowblock+=3){
            for(int colblock=0;colblock<board.length;colblock+=3){
                HashSet<Character> st = new HashSet<>();
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        int currrow = rowblock+i;
                        int currcol = colblock+j;
                        if(board[currrow][currcol]=='.'){
                            continue;
                        }
                        else if(!st.contains(board[currrow][currcol])){
                            st.add(board[currrow][currcol]);
                        }
                        else{
                            return false;
                        }
                    }
                }
            }
        }

        return true;
    }
}
