//package IOandNIO;
//import java.io.FileInputStream;
//import java.io.IOException;
//public class FileInputStreamExample {
//    public static void main(String[] args) {
//        FileInputStreamExample fis = null;
//        try{
//            //create a fis to read from a file
//            fis = new FileInputStreamExample("example.txt");
//
//            int content;
//            //read until the end of the file is reached
//            while((content = fis.read()) != -1){
//                //convert the byte to char to print
//                System.out.print((char)content);
//            }
//        } catch(IOException e){
//            e.printStackTrace();
//        } finally {
//            try{
//                if(fis != null){
//                    fis.close();
//                }
//            }catch (IOException ex){
//                ex.printStackTrace();
//            }
//        }
//
//    }
//}
