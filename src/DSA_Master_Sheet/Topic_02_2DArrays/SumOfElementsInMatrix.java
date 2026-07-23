package DSA_Master_Sheet.Topic_02_2DArrays;
/*
    * Problem Name: Sum of elements in matrix
    * Difficulty: Easy , Level 2/5(DSA Master Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1)
 */
public class SumOfElementsInMatrix {
    public int sumOfMatrix(int[][] mat) {
        int sum = 0;
        int row = mat.length;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j <mat[i].length ; j++){
                sum += mat[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
