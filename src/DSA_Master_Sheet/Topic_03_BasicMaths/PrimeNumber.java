package DSA_Master_Sheet.Topic_03_BasicMaths;
/*
    * Problem Name: Prime Number or not
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG (https://www.geeksforgeeks.org/problems/prime-number2314/1)
 */
public class PrimeNumber {
    static boolean isPrime(int n) {
        int count = 0;
      // T.C = O(SQRT(N))
        if (n <= 1)return false;
        for(int i =1 ; i*i <= n ; i++){
            if(n%i == 0){
                count++; // count a no. from the pair
                if(i != n/i){
                    count++; // count another no. from the pair if both are not same
                }
            }
        }
        if(count == 2)return true;
        return false;

      // T.C = O(N)
       /* for(int i = 1 ; i<=n ; i++){
            if(n % i == 0){
                count++;
            }
        }
        if(count == 2) return true;
        return false;*/
    }
}
