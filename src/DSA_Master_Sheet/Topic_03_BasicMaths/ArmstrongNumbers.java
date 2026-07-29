package DSA_Master_Sheet.Topic_03_BasicMaths;
/*
    * Problem Name: Armstrong Numbers
    * Difficulty: Easy , level 1/5 (DSA_Master_Sheet)
    * Platform: GFG(https://www.geeksforgeeks.org/problems/armstrong-numbers2727/1)

 */
public class ArmstrongNumbers {
    static boolean armstrongNumber(int n) {
        int org = n ,countNum = n, sum = 0 , count =0;
        // first count the length of the digit
        while(countNum != 0){
            count++;
            countNum /= 10;
        }
        // adding each dig
        while(n!=0){
            int rem = n%10;
            sum += Math.pow(rem , count);
            n /= 10;
        }
        if(sum == org) return true;

        return false;
    }
    public static void main(String[] args) {
        //for test cases
    }
}
