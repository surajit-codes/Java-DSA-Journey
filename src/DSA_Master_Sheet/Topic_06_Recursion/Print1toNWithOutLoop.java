package DSA_Master_Sheet.Topic_06_Recursion;
/*
    * Problem Name: Print 1 to N Without Using Loop
    * Difficulty: Basic , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1)
 */
public class Print1toNWithOutLoop {
    public void printTillN(int n) {
        if(n==0) return;
        printTillN(n-1);
        System.out.print(n +" ");
    }
}
