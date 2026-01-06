package Day_08_FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DiaryReader {
    public static void main(String[] args){

        String path =  "secret_diary.txt" ;
        try(BufferedReader reader = new BufferedReader( new FileReader(path))){
            String line ;
            while (((line = reader.readLine()) != null)){

                System.out.println(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Could not locate the file");
        } catch (IOException e){
            System.out.println("Something went wrong !");
        }
    }
}
