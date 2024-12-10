package lw2;

import java.util.Scanner;

public class example14_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число, для проверки деления на 4 и не больше 10: ");
        int number = in.nextInt();
        if (number % 4 == 0 && number >= 10)
            System.out.println("Число " + number + " делится на 4 и больше 10");
        else if(number %4 ==0 )
            System.out.println("Число " + number + " делится на 4 и меньше 10");
        else if (number >=10)
            System.out.println("Число " + number + " не делится на 4, но больше 10");
        else System.out.println("Число " + number + " не делится на 4 и не больше 10");
    }
}
