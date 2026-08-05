package DSA_Master_Sheet.Topic_06_Recursion;
/*
    * problem Name : Factorial
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/factorial5739/1)
 */
public class Factorial {
    int factorial(int n) {
        if(n==0) return 1;
        return n * factorial(n-1);
    }
}
