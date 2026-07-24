package DSA_Master_Sheet.Topic_02_2DArrays;
/*
    * Problem Name: Count Negative numbers in sorted array
    * Difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/description/)
 */
public class CountNegativeNumbersInSortedMatrix {
    public int countNegatives(int[][] grid) {
        int count = 0;
        for(int row = 0 ; row < grid.length ; row++){
            for(int col = 0 ; col < grid[row].length ; col ++){
                if(grid[row][col] < 0) count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
