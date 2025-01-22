package lw5.example14_6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое чсло: ");
        int oneNumber = in.nextInt();
        System.out.print("Введите второе число: ");
        int twoNumber = in.nextInt();
        classTest testOne = new classTest(4,10);
        testOne.outMaxAndMin();
        testOne.setMaxAndMin(oneNumber,twoNumber);
        testOne.outMaxAndMin();
    }
}
