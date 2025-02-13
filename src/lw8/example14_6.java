package lw8;

import java.io.*;

public class example14_6 {
    public static void main(String[] args) throws IOException {
        Reader in = null;
        Writer out = null;
        try{
            in = new FileReader("D:\\MyFile1.txt");
            out = new FileWriter("D:\\MyFile2.txt", true);
            int oneByte;
            while((oneByte = in.read())!= -1) {
                //out.write((char) oneByte);
                out.append((char) oneByte);
                System.out.print((char) oneByte);
            }
            }
        catch (IOException e){
                System.out.println(" Ошибка - " + e);
            }
        finally{
            in.close();
            out.close();

        }
    }
}
