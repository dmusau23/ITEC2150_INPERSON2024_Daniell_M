package FileIODemo.Beginning1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        try {
            File file = new File("src/hamlet.txt");

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            System.out.println(e);
        }
    }
}
