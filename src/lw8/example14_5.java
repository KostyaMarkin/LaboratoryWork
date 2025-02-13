package lw8;

import java.io.*;
import java.util.Scanner;

public class example14_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите имя файла:");
        String fname = in.nextLine();
        try {
            File f1 = new File(fname);
            f1.createNewFile();
            System.out.println("Полный путь файла: " + f1.getAbsolutePath());
            System.out.println("Введите количество строк для записи в файл: ");
            int n = in.nextInt();
            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(f1));

            for(int i = 0; i < n ; i++){
                System.out.println("Введите строку: ");
                String stroka = in.nextLine();
                dOut.writeUTF(stroka);

            }
            dOut.flush();
            dOut.close();
            DataInputStream dIn = new DataInputStream(new FileInputStream(f1));
            while(true){
                System.out.println(dIn.readUTF());
            }
        }
        catch (Exception e){
            System.out.println("" + e);
        }
    }
}
