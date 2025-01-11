package lw4;

import java.util.Random;
import java.util.Scanner;

public class example14_6 {
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
        System.out.print("Введите какой столбец удалить: ");
        int line = in.nextInt();
        System.out.print("Введите какую строку удалить: ");
        int column = in.nextInt();
        int oldColumn = 0;
        int[][] result = new int[width-1][height-1];
        for (int i = 0; i < width-1; i++) {
            int oldLine = 0;
            for (int z = 0; z < height-1; z++) {
                if(oldColumn == column - 1) oldColumn++;
                if(oldLine == line - 1) oldLine++;
                result[i][z] = numbers[oldColumn][oldLine];
                oldLine++;
            }
            oldColumn++;
        }
        System.out.println("Итоговый массив: ");
        for(int[] row : result){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }
}
