class Solution {
    public void setZeroes(int[][] matrix) {
        int[][] temp = new int[matrix.length][matrix[0].length];

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                temp[row][col] = -1;
            }
        }

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(matrix[row][col]==0){
                    //temp[row][col] = 0;
                    int curr_row = row;
                    int curr_col = col;
                    for(int i=0;i<matrix.length;i++){
                        temp[i][curr_col] = 0;
                    }

                    for(int j=0;j<matrix[0].length;j++){
                        temp[curr_row][j] = 0;
                    }
                }
                // else{
                //     if(temp[row][col] != 0){
                //         temp[row][col] = matrix[row][col];
                //     }
                // }
            }
        }

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                if(temp[row][col] == -1){
                    temp[row][col] = matrix[row][col];
                }
            }
        }

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[0].length;col++){
                matrix[row][col] = temp[row][col];
            }
        }
    }
}
