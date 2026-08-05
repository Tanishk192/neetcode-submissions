class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> ans = new ArrayList<>();
        int startingRow = 0;
        int endingRow = m-1;
        int startingCol = 0;
        int endingCol = n-1;

        while(startingRow<=endingRow && startingCol<=endingCol){
            for(int col=startingCol;col<=endingCol;col++){
                ans.add(matrix[startingRow][col]);
            }
            startingRow++;

            for(int row=startingRow;row<=endingRow;row++){
                ans.add(matrix[row][endingCol]);
            }
            endingCol--;

            if(startingRow<=endingRow){
                for(int col=endingCol;col>=startingCol;col--){
                    ans.add(matrix[endingRow][col]);
                }
                endingRow--;
            }

            if(startingCol<=endingCol){
                for(int row=endingRow;row>=startingRow;row--){
                    ans.add(matrix[row][startingCol]);
                }
                startingCol++;
            }
        }

        return ans;
    }
}
