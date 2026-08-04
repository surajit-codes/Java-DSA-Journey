package DSA_Master_Sheet.Topic_06_Recursion;
/*
    * Problem Name: Print N to 1 Without using loops
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1)

 */
public class PrintNto1WithOutLoop {
    void printNos(int n) {
        if(n==0) return;
        System.out.print(n +" ");
        printNos(n-1);
    }
}
