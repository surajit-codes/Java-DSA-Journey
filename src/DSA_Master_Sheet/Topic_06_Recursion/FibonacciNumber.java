package DSA_Master_Sheet.Topic_06_Recursion;
/*
    * Problem Name: Fibonacci Number
    * Difficulty: Easy , Level 1/5
    * Platform: LeetCode (https://leetcode.com/problems/fibonacci-number/)
 */
public class FibonacciNumber {
    public int fib(int n) {
        if(n<=1) return n;
        return fib(n-1) + fib(n-2);
    }
}
