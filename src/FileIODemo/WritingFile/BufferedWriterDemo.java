package FileIODemo.WritingFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {
    public static void main(String[] args) {
        String data = "To be or not to be, that is the question.\nFrom Hamlet.";
        try(BufferedWriter fw = new BufferedWriter(new FileWriter("newFile.txt"))){
            fw.write(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
