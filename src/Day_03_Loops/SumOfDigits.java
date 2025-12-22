package Day_03_Loops;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum =0 , num , dig;
        System.out.print("Enter Digits: ");
        num = sc.nextInt();
        while(num != 0){
           dig = num%10;
           sum += dig;
           num = num/10;
        }
        System.out.println("The Sum of The Digits is : " + sum);
        sc.close();
    }
}
