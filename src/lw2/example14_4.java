package lw2;

import java.util.Scanner;

public class example14_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = in.nextInt();
        if ( number >=5 && number <= 10 ) {
            System.out.println("Число " + number + " входит в диапазон от 5 до 10 включительно");
        }

    }
}
