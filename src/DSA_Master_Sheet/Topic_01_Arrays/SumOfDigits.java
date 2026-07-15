package DSA_Master_Sheet.Topic_01_Arrays;
/*
    * Problem Name: Sum of Digits
    * Difficulty: 1 (Easy)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/sum-of-digits1742/1)

 */
public class SumOfDigits {
    static int sumOfDigits(int n) {
        int sum = 0;
        while(n != 0){
            int num = n%10;
            sum += num;
            n = n/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // for test cases
    }
}
