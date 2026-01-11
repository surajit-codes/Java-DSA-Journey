package Day_09;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int choice;
        int amount;
        String path = "balance.txt";
        File file = new File(path);
        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm();

        if(!file.exists()){
            try(FileWriter fileWriter = new FileWriter(path)){
                fileWriter.write(String.valueOf(atm.getBalance()));
            }catch (IOException e){
                System.out.println("Unable to create file");
            }
        }
        if(file.exists()){
           try(BufferedReader reader = new BufferedReader(new FileReader(path))){
             atm.setBalance(Integer.parseInt(reader.readLine()));
           } catch (IOException e){
               System.out.println("Unable to read file ");
           }

        }
        do{
            System.out.println("************************************");
            System.out.println("Welcome to ATM");
            System.out.println("************************************");
            System.out.println("For Balance Enter: 1");
            System.out.println("For Deposit Enter: 2");
            System.out.println("For Withdraw Enter: 3");
            System.out.println("For Exit Enter : 4");
            System.out.println("************************************");
            System.out.print("Enter Your Choice: ");
            choice = sc.nextInt();
            switch (choice){

                case 1 :
                    System.out.println("Balance: " + atm.getBalance() );
                    break;
                case 2 :
                        System.out.print("Enter amount: ");
                        amount = sc.nextInt();
                        if (amount <= 0) {
                            System.out.println("Invalid amount");
                        }else {
                            atm.deposit(amount);
                            try(FileWriter fw = new FileWriter(path)){
                                fw.write(String.valueOf(atm.getBalance()));
                            } catch(IOException e){
                                System.out.println("Unable to write file");
                            }
                        }
                        break ;
                case 3 :
                    System.out.print("Enter amount: ");
                    amount = sc.nextInt();
                    if (amount > atm.getBalance() || amount <= 0) {
                        System.out.println("Insufficient amount or Invalid Input");
                    } else {
                        atm.withdraw(amount);
                        try(FileWriter fileWriter = new FileWriter(path)){
                            fileWriter.write(String.valueOf(atm.getBalance()));
                        } catch (IOException e){
                            System.out.println("Unable to write file");
                        }
                    }
                    break;

                case 4 :
                    System.out.println("Thank you for using ATM");
                    break;

                default:
                    System.out.println("Invalid Input");
            }

        }while (choice != 4);
        sc.close();
    }
}
