package lw8;

import java.io.*;
import java.util.Random;

public class example14_11 {
    public static void main(String[] args)throws IOException {
        BufferedWriter bufWriter = null;
        String path = SetNewFile("D:\\MyFileNew1.txt");
        try{
            bufWriter = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(path),"cp1251"));
            int lineCount = 0;
            String stroka = "";
            bufWriter.write("Здравствуйте, уважаемые друзья \n");
            bufWriter.write("Добавим несколько строк в файл с числами типа double \n");
            int count  =5;
            Random random = new Random();
            while(count > 0){
                bufWriter.write(String.valueOf(random.nextDouble(-100,100) + "\n"));
                count--;
            }
        }catch (IOException e){
            System.out.println("Ошибка - " + e);
        } finally {
            bufWriter.flush();
            bufWriter.close();
        }
        ReWriteFile(path, "D:\\MyFile2.txt");
    }

    public static String SetNewFile(String path) {
        try {
            File fileOne = new File(path);

            fileOne.createNewFile();
            System.out.println("Создан файл по пути: " + fileOne.getAbsolutePath());
            return fileOne.getAbsolutePath();

        }catch (IOException e){
            System.out.println("Ошибка создания файла - " + e);
        }
        finally {
            return path;
        }

    }

    public static void ReWriteFile(String pathOneFile, String pathTwoFile)throws IOException{
        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        try{
            bufReader = new BufferedReader(new InputStreamReader(new FileInputStream(pathOneFile), "cp1251"));
            bufWriter = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(pathTwoFile),"cp1251"));
            int lineCount = 0;
            String stroka;
            while((stroka=bufReader.readLine()) != null){
                lineCount++;
                if(lineCount == 2){
                    bufWriter.write(lineCount + ": " + stroka);
                    bufWriter.newLine();
                }
                if(lineCount > 2 && Double.parseDouble(stroka) > 0){
                    bufWriter.write(lineCount + ": " + stroka);
                    bufWriter.newLine();
                }
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
