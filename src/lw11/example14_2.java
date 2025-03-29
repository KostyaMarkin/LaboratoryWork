package lw11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example14_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер первого массива ");
        int countOne = in.nextInt();
        System.out.print("Введите размер второго массива ");
        int countTwo = in.nextInt();
        int[] arrOne = new int[countOne];
        int[] arrTwo = new int[countTwo];
        Random random = new Random();
        for(int i = 0; i < countOne; i++){
            arrOne[i] = random.nextInt(0,50);

        }
        for(int i = 0; i < countTwo; i++){
            arrTwo[i] = random.nextInt(0,50);
        }
        System.out.println("Массив arrOne: ");
        System.out.println(Arrays.toString(arrOne));
        System.out.println("Массив arrTwo: ");
        System.out.println(Arrays.toString(arrTwo));
        int[] arrResult = fintCommonElements(arrOne,arrTwo);
        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] fintCommonElements(int[] arrOne, int[] arrTwo){
        return Arrays.stream(arrOne)
                .filter(x -> Arrays.stream(arrTwo).anyMatch(y -> y == x)).toArray();
    }
}
