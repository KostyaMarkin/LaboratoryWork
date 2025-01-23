package lw6.example14_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммы квадратов: ");
        int number = in.nextInt();
        int result = classTest.getSumSqr(number);
        System.out.printf("Сумма квадратов натуральных чисел %d равна %d",number,result);
    }
}
