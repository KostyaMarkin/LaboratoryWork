package lw3;

import java.util.Random;
import java.util.Scanner;

public class example14_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел для суммы: ");
        int number = in.nextInt();
        Random random = new Random();
        int[] sumNumber = new int[number];
        int sum = 0;
        for(int i = 0; i < sumNumber.length; i++){
            do{
                int randomNumber = random.nextInt(50);
                if(randomNumber % 5 == 2 || randomNumber % 3 == 1){
                    sumNumber[i] = randomNumber;
                }
            }while (sumNumber[i] == 0);
            System.out.print(sumNumber[i] + ", ");
            sum += sumNumber[i];
        }
        System.out.print("сумма этих чисел равна " + sum);
    }
}
