package FileIODemo.WritingFile;

import java.io.FileWriter;
import java.io.IOException;

public class WritingFileDemo1 {
    public static void main(String[] args) {
        String data = "To be or not to be, that is the question.\nFrom Hamlet.";
        try(FileWriter fw = new FileWriter("src/FileIODemo/WritingFile/dataOutput.txt")){
            fw.write(data);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
