package DSA_Master_Sheet.Topic_02_2DArrays;
/*
    * Problem Name: Matrix Diagonal Sum
    * Difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/matrix-diagonal-sum/description/)
 */
public class MatrixDiagonalSum {
    //FOR TIME COMPLEXITY O(N)
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int row = 0 ; row < mat.length ; row++){
            sum += mat[row][row]; // here adding primary diagonal
            // now adding only element of secondary diagonal
            if(row != mat.length - row -1) sum += mat[row][mat.length - row -1];
        }
        return sum;
    }
    // FOR TIME COMPLEXITY O(N^2)
   /* public int diagonalSum(int[][] mat) {
        int sum = 0;
        for(int row = 0 ; row < mat.length ; row++){
            for(int col = 0 ; col < mat[row].length; col++){
                if(row == col || row + col == mat.length -1) sum += mat[row][col];
            }
        }
        return sum;
    }*/
    public static void main(String[] args) {
        //for test cases
    }
}
