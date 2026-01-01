package Day_07_Practice;
import java.util.Scanner;

public class Division {
    public static void main(String[] args){
        int a , b;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter 1st no: ");
            a = sc.nextInt();
            System.out.print("Enter 2nd no: ");
            b = sc.nextInt();
            System.out.println(a / b);

        } catch (Exception e) {
            System.out.println("Some thing went wrong.");
        } finally {
            System.out.println("Calculation finished");
        }
    }
}
