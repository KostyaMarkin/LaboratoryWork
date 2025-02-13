package lw8;

import java.io.*;

public class example14_10 {
    public static void main(String[] args)throws IOException {
        BufferedReader bufReader = null;
        PrintWriter outWriter = null;
        try{
            bufReader = new BufferedReader(new InputStreamReader( new FileInputStream("D:\\MyFile1.txt"),"cp1251"));
            outWriter = new PrintWriter("D:\\MyFile2.txt", "cp1251");
            int lineCount = 0;
            String stroka;
            while((stroka = bufReader.readLine()) != null){
                lineCount++;
                outWriter.println(lineCount + ": " + stroka);

            }
        }catch (IOException e){
            System.out.println("Ошибка - " + e);
        }
        finally {
            bufReader.close();
            outWriter.flush();
            outWriter.close();
        }
    }
}
