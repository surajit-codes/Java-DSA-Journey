package DSA_Master_Sheet.Topic_06_Recursion;
/*
    * Problem Name: Pow(x,n)
    * Difficulty: Medium , Level 2/5 (DSA_Master_Sheet)
    * Platform: LeetCode (https://leetcode.com/problems/powx-n/)
 */
public class PowOfxn {
    public double myPow(double x, int n) {
        if(n<0){
            long num = -(long)n;
            double a = 1/x ;
            return power(a,num);
        }
        return power(x,n);
    }
    private double power (double a , long b){
        double ans;
        if(b == 0) return 1;
        double call = power(a , b/2);
        if(b%2 == 0) ans = call * call;
        else ans = call * call * a;
        return ans;
    }
}
