package lw4;

import java.util.Random;
import java.util.Scanner;

public class example14_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        System.out.print("количество столбцов: ");
        int height = in.nextInt();
        System.out.print("количество строк: ");
        int width = in.nextInt();
        int[][] numbers = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int z = 0; z < height; z++) {
                numbers[i][z] = random.nextInt(400);
            }
        }
        System.out.println("Исходный массив");
        for(int[] row : numbers){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println("");
        }
        System.out.println("Транспонированный массив");
        int[][] result = new int[height][width];
        for (int i = 0; i < width; i++) {
            for (int z = 0; z < height; z++) {
                result[z][i] = numbers[i][z];
            }
        }
        for(int[] row : result){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }
}
