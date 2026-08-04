package DSA_Master_Sheet.Topic_06_Recursion;
import java.util.Scanner;
/*
    * Problem Name: Sum Of All Natural Numbers
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/reverse-coding2452/1)
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(sum(n));
    }
    static int sum(int n){
        if(n==0) return 0;
        int ans = n+sum(n-1);
        return ans;
    }
}
