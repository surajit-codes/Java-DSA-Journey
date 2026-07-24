package DSA_Master_Sheet.Topic_02_2DArrays;
/*
    * Problem Name: Count Number Of Zeroes in a sorted matrix
    * Difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: GFG(https://www.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1)
 */
public class CountNumberOfZeroesInSortedMatrix {
    public int countZeros(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[i][j] == 0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
