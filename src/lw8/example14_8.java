package lw8;

import java.io.*;
import java.net.URL;

public class example14_8 {
    public static void readAllByByte(Reader in)throws IOException {
        while(true){
            int oneByte = in.read();
            if(oneByte != -1){
                System.out.print((char) oneByte);
            }else{
                System.out.print("\n" + " конец");
                break;
            }
        }
    }
    public static void main(String[] args) {
        try{
            InputStream inFile = new FileInputStream("D:\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile,"cp1251");
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inURL = new URL("https://google.com").openStream();
            Reader rURL = new InputStreamReader(inURL,"cp1251");
            readAllByByte(rURL);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            InputStream inArray = new ByteArrayInputStream(new byte[] {5,8,3,9,11});
            Reader rArray = new InputStreamReader(inArray,"cp1251");
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();
        }catch (IOException e){
            System.out.println("Ошибка -" + e);
        }
    }
}
