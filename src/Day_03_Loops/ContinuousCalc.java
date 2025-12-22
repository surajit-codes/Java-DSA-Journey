package Day_03_Loops;

import java.util.Scanner;

public class ContinuousCalc {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 , num2 , result = 0;
        char op;
        String repeat  ;
      do {
          System.out.print("Enter the 1st num: ");
          num1 = sc.nextDouble();
          System.out.print("Enter (+,-,/,*,^): ");
          op = sc.next().charAt(0);
          System.out.print("Enter 2nd num: ");
          num2 = sc.nextDouble();
          switch(op){
              case '+' :
                  result = num1 + num2 ;
                  break;
              case '-' :
                  result = num1 - num2 ;
                  break;
              case '*' :
                  result = num1 * num2 ;
                  break;
              case '^' :
                  result = Math.pow(num1 ,num2);
                  break;
              case'/' :
                  if(num2==0){
                      System.out.println("Undefined ! Zero can't be a denominator");
                  }
                  else{
                      result = num1 / num2;
                  }
                  break;
              default : {
                  System.out.println("Invalid Operator!!");
              }
          }
          System.out.println("The result is : " + result);
          sc.nextLine();
          System.out.print("Do you want to calculate again(yes/no): ");
           repeat = sc.nextLine();

      } while (repeat.equalsIgnoreCase("yes"));


        sc.close();
    }
}
