package lw9.example14_2;

import java.util.Scanner;

public class Recursia {
    public static void main(String[] args) {
        System.out.print("Введите целое число для перевода: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print("Результат: " + Perevod(n));
    }

    public static String Perevod(int x){
        int result;
        if(x == 0){
            return "";
        }else{
            result = x % 2;
            x = x / 2;
        }
        return Perevod(x) + String.valueOf(result);
    }
}
