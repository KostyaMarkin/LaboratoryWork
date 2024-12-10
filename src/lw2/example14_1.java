package lw2;

import java.util.Scanner;

public class example14_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, для проверки деления на 3: ");
        int number = in.nextInt();
        if(number % 3 == 0) System.out.println("Число "+ number + " делится на 3");
        else System.out.println("Число "+ number + " не делится на 3");
    }
}
