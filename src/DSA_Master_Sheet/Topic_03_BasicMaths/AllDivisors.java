package DSA_Master_Sheet.Topic_03_BasicMaths;
/*
    * Problem Name: All Divisors of a number
    * Difficulty: Easy , Level 1/5 (DSA_Master_Sheet)
    * Platform: GFG(https://www.geeksforgeeks.org/problems/all-divisors-of-a-number/1)
 */
import java.util.ArrayList;
import java.util.Collections;

public class AllDivisors {
    public ArrayList<Integer> getDivisors(int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i =1 ; i*i <= n ; i++){
            if(n%i==0){
                ans.add(i);
                if(n/i != i) ans.add(n/i);
            }
        }
        Collections.sort(ans);
        return ans;
    }
}
