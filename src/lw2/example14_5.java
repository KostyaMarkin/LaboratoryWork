package lw2;

import java.util.Scanner;

public class example14_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        int answer = number / 1000;
        if( answer != 0 ) System.out.print("Пользователь ввёл " + answer + " тысяч");
        else  System.out.print("Пользователь ввёл число меньше тысячи");
    }
}
