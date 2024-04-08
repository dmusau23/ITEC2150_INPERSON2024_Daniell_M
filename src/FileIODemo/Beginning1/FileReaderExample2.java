package FileIODemo.Beginning1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample2 {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("src/hamlet.txt"));
            String line = reader.readLine();
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }catch(IOException e){

        }
    }
}
