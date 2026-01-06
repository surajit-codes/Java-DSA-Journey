package Day_08_FileHandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class DiaryWriter {
    public static void main (String[] args){

    Scanner scanner = new Scanner(System.in);
    String filePath = "secret_diary.txt";
    String textWrite;
        System.out.print("Enter what you want to write?: ");
        textWrite = scanner.nextLine();
    try(FileWriter fileWriter = new FileWriter(filePath)){
        fileWriter.write(textWrite);
        System.out.println("File has successfully written");
    } catch (IOException e){
        System.out.println("Could not write file");
    }

    scanner.close();

    }
}
