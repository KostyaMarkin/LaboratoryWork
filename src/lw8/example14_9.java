package lw8;

import java.io.*;

public class example14_9 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        try{
            bufReader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\MyFile1.txt"), "cp1251"));
            bufWriter = new BufferedWriter( new OutputStreamWriter(new FileOutputStream("D:\\MyFile2.txt"),"cp1251"));
            int lineCount = 0;
            String stroka;
            while((stroka=bufReader.readLine()) != null){
                lineCount++;
                System.out.println(lineCount + ": " + stroka);
                bufWriter.write(lineCount + ": " + stroka);
                bufWriter.newLine();;
            }
        } catch (IOException e) {
            System.out.println("Ошибка - " + e);
        }
        finally{
            bufReader.close();
            bufWriter.flush();
            bufWriter.close();
        }
    }
}
