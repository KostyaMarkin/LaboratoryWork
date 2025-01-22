package lw5.example14_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите переменную: ");
        int number = in.nextInt();
        classTest test = new classTest();
        classTest testTwo = new classTest(number);
        testTwo.setNumberTest();
        testTwo.setNumberTest(number);
    }
}
