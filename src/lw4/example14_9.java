package lw4;

import java.util.Scanner;

public class example14_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку для шифровки: ");
        String string = in.nextLine();
        System.out.print("Введите ключ: ");
        int shift = in.nextInt();
        String encryptText = getEncryptString(string, shift);
        System.out.println("Зашифрованное сообщение: ");
        System.out.println(encryptText);
        boolean check = true;
        System.out.println("Расшифровать сообщение?");
        while (check){
            String answer = in.nextLine();
            if(answer.equals("y")){
                encryptText = getEncryptString(encryptText, -shift);
                System.out.println("Расшифрованное сообщение: ");
                System.out.println(encryptText);
                check = false;
            } else if ( answer.equals("n")){
                check = false;
                System.out.println("До свидания!");
            }
            else System.out.println("Введены не корректные данные. Введите y или n");
        }
    }
    public static String getEncryptString(String encryptString, int shift){
        char[] arrayChar = encryptString.toCharArray();
        long[] arrayInt = new long[arrayChar.length];
        char[] arrayCharNew = new char[arrayChar.length];
        for (int i = 0; i<arrayChar.length; i++){
            arrayInt[i] = arrayChar[i] + shift;
            arrayCharNew[i] = (char) arrayInt[i];
        }
        encryptString = new String(arrayCharNew);
        return  encryptString;
    }
}
