package lw3;

import java.util.Random;
import java.util.Scanner;

public class example14_6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        try{
            int count = in.nextInt();
            int[]numbers = new int[count];
            Random random = new Random();
            int number = 0;
            for (int i = 0; i < numbers.length; i++){
                do{
                    number++;
                    if(number % 5 ==2) numbers[i] = number;
                } while (numbers[i] == 0);
                System.out.print(numbers[i] + ", ");

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
