package Day_03_Loops;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a=0 , b = 1, c, n, i;
        System.out.print("Enter the Number: ");
        n = sc.nextInt();
        for (i=0; i<n ; i++){
            System.out.print(a+ " " );
            c = a + b ;
            a = b ;
            b = c ;

        }
        sc.close();
    }
}
