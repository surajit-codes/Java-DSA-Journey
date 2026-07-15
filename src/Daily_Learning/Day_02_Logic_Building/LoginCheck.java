package Daily_Learning.Day_02_Logic_Building;
import java.util.Scanner;
public class LoginCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String username , password;
        System.out.print("Enter the username: ");
        username = sc.nextLine();
       if(username.equals("surajit-codes")){
           System.out.print("Enter the password: ");
           password = sc.nextLine();
           if(password.equals("java-dsa-journey")){
               System.out.println("Login Successful! 😃");
           }
           else {
               System.out.println("Incorrect Password 😥");
           }
       }
       else{
           System.out.println("Incorrect username 😐, Please enter the valid username to login! 🤗");
       }
        sc.close();
    }
}
