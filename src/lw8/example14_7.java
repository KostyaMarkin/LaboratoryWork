package lw8;

import java.io.*;

public class example14_7 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufRead = null;
        BufferedWriter bufWrite = null;
        try{
            bufRead = new BufferedReader(new FileReader("D:\\MyFile1.txt"), 1024);
            bufWrite = new BufferedWriter( new FileWriter("D:\\MyFile2.txt"));
            int lineCount = 0;
            String stroka;
            while((stroka = bufRead.readLine())  != null){
                lineCount ++;
                System.out.println(lineCount + ": " + stroka);
                bufWrite.write(stroka);
                bufWrite.newLine();
            }
        }catch (IOException e){
            System.out.println("Ошибка - " + e);
        }
        finally{
            bufRead.close();
            bufWrite.flush();
            bufWrite.close();

        }
    }
}
