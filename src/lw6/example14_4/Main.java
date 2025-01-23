package lw6.example14_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для нахождения двойного факториала: ");
        int number = in.nextInt();
        int result = classTest.getDoubleFactorial(number);
        System.out.printf("Двойной факториал %d равен %d",number,result);
    }
}
