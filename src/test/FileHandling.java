package test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileHandling {

    public static void main(String[] args) {

        String str1 = "Order Confirmation 1233434";

        FileOutputStream file1;
        try{

            file1 = new FileOutputStream("results.txt", true);
            file1.write(str1.getBytes());

        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
