package IOandNIO;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("LargeFile.txt")) {
            int character;
            while((character = fr.read()) != -1){
                //process the character
            }
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
