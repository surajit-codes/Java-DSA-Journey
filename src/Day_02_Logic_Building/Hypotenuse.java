package Day_02_Logic_Building;
import java.util.Scanner;
public class Hypotenuse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter the side a: ");
        a = sc.nextDouble();
        System.out.print("Enter the side b: ");
        b = sc.nextDouble();
        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        System.out.printf("The Hypotenuse of the triangle is : %.2f" , c);
        sc.close();
    }
}
