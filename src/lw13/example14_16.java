package lw13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class example14_16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] numbers = new int[5][5];
        int stolbec = -1;
        Random random = new Random();
        try{
            for(int i = 0; i < numbers.length; i ++){
                for(int j =0; j < numbers[i].length; j++){
                    numbers[i][j] = random.nextInt(-1000,1000);
                }
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex);
        }
        System.out.print("Какой столбец необходимо вывести? ");
        try{
            stolbec = in.nextInt();
        }catch (InputMismatchException ex){
            System.out.println("Введено не число!");
        }
        try{
            int[] numStolb = Arrays.stream(numbers[stolbec]).toArray();
            for( int item : numStolb){
                System.out.print(item + "\n ");
            }
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Такого столбца не существует!");
        }
    }
}
