class Solution {
    public void rotate(int[][] matrix) {
        int[][] arr = new int[matrix.length][matrix.length];

        int temp = matrix.length-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                arr[j][temp] = matrix[i][j];
            }
            temp--;
        }

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                matrix[i][j] = arr[i][j];
            }
        }
    }
}
