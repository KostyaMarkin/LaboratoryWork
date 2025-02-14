package lw8;

import java.io.*;

public class example14_12 {
    public static void main(String[] args)throws IOException {
        BufferedReader bufReader = null;
        BufferedWriter bufWriter = null;
        try{
            bufReader = new BufferedReader(new InputStreamReader(new FileInputStream("D:\\GogolIV.txt")));
            bufWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:\\NewFile.txt")));
            String stroka;
            int countStroka = 0;
            int countChooseWord = 0;
            while((stroka = bufReader.readLine()) != null){
                countStroka++;

                String[] arrayStrok = stroka.split(" ");
                int count = 0;
                while(count < arrayStrok.length){
                    if(checkGlasSymbol(arrayStrok[count].toLowerCase().charAt(0))){
                        countChooseWord++;
                        bufWriter.write("Из строки " + countStroka);
                        bufWriter.write(" " + arrayStrok[count]);
                        bufWriter.newLine();
                    }
                    count ++;
                }
                bufWriter.write("Конец строки " + countStroka + ". Итого выбрано слов по строке:" + countChooseWord);
                bufWriter.newLine();
            }
        }
        catch (IOException e){
            System.out.println("Ошибка - " + e);
        }
        finally {
            bufReader.close();
            bufWriter.flush();
            bufWriter.close();
        }
    }

    public static boolean checkGlasSymbol(char symbol){
        char[] glasSymbols = new char[] {'а','е','ё','и','о','у','ы','э','ю','я', '-', ',',':'};
        boolean result = true;
        for(int i =0; i< glasSymbols.length; i++){
            if(glasSymbols[i] == symbol){
                result = false;
                break;
            }
            else result = true;
        }
        return result;
    }
}
