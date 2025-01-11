package lw4;

import java.util.Random;
import java.util.Scanner;

public class example14_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("количество столбцов: ");
        int height = in.nextInt();
        System.out.print("количество строк: ");
        int width = in.nextInt();
        int number = 0;
        int i = 0;
        int z = 0;
        String orientation = "Right";
        int[][] masNumbers = new int[height][width];
        while ( i >= 0 && i < width && z < height){
            if (orientation == "Right"){
                if ( i == width - 1){
                    masNumbers[z][i] = number;
                    number++;
                    z++;
                    orientation = "Left";
                }
                else {
                    masNumbers[z][i] = number;
                    i++;
                    number++;
                }
            } else {
                if( i == 0){
                    masNumbers[z][i] = number;
                    number++;
                    z++;
                    orientation = "Right";
                }
                else {
                    masNumbers[z][i] = number;
                    i--;
                    number++;
                }
            }
        }
        System.out.println("Итоговый массив: ");
        for(int[] row : masNumbers){
            for(int element : row){
                System.out.print(element + " ");
            }
            System.out.println("");
        }
    }
}
