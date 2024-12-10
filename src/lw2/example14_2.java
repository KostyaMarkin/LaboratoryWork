package lw2;

import java.util.Scanner;

public class example14_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа для проверки деления на 5 с остатком 2 и деления на 7 с остатком 1");
        System.out.print("Введите число, для проверки условий деления: ");
        int number = in.nextInt();
        if(number % 5 == 2  && number % 7 == 1) System.out.println("Число " + number + " соответствует условиям деления");
        else System.out.println("Число " + number + " не соответствует условиям делениям");
    }
}
