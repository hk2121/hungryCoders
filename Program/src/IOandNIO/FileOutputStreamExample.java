//package IOandNIO;
//
//import java.io.IOException;
//
//public class FileOutputStreamExample {
//    public static void main(String[] args) {
//        FileOutputStreamExample fos = null;
//        try{
//            fos= new FileOutputStreamExample("Example.txt");
//            String data = "Hello, World!";
//            //Convert string to byte array
//            byte[] byteArray = data.getBytes();
//            fos.write(byteArray);
//        } catch (IOException e){
//            e.printStackTrace();
//        }finally {
//            try{
//                if(fos != null){
//                    fos.close();
//                }
//            } catch(IOException ez){
//                ez.printStackTrace();
//            }
//        }
//    }
//}
