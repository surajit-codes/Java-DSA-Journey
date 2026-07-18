package DSA_Master_Sheet.Topic_01_Arrays;
/*
    *Problem Name: Array With All Palindrome
    * Difficulty: Easy , Level 2/5 (DSA Master Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/palindromic-array-1587115620/1)
 */
public class ArrayWithAllPalindrome {
    public static boolean isPalinArray(int[] arr) {
        int n = arr.length;
        for(int i = 0 ; i < n ; i++){
            int num = arr[i];
            int rev = 0;
            while(num != 0){
                int dig = num%10;
                rev = rev*10 + dig ;
                num = num /10 ;
            }

            if(arr[i] != rev) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
