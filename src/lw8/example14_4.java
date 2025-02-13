package lw8;

import java.io.*;
import java.util.Scanner;

public class example14_4 {
    public static void main(String[] args) {
        try{
            File f1 = new File("D:\\My\\numIsh.txt");
            f1.createNewFile();
            Scanner in = new Scanner(System.in,"cp1251");
            DataOutputStream wr = new DataOutputStream(new FileOutputStream(f1.getAbsolutePath()));
            System.out.println("Сколько вещественных чисел записать в файл?");
            int count = in.nextInt();
            System.out.print("Введите числа:");
            for(int i = 0; i < count;i++){
                wr.writeFloat(in.nextFloat());
            }
            wr.flush();
            wr.close();

            File f2 = new File("D:\\numRez.txt");
            f2.createNewFile();
            DataInputStream read = new DataInputStream( new FileInputStream(f1.getAbsolutePath()));
            wr = new DataOutputStream(new FileOutputStream(f2.getAbsolutePath()));
            try{
                while(true){
                    float number = read.readFloat();
                    wr.writeFloat(number);
                    System.out.println(" Число"+ (float)number);
                }
            }catch (EOFException e){}
            wr.flush();
            wr.close();
            read.close();
        } catch (IOException e) {
            System.out.print("End of File");
        }
    }
}
