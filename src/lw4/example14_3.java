package lw4;

import java.util.Scanner;

public class example14_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int width = in.nextInt();
        int[][] numbers = new int[width][width];
        for(int i = 0; i < width ; i ++){
            for(int j = 0; j < width ; j ++){
                numbers[i][j] = 2;
            }
        }
        for(int i =0; i< width;i++){
            for(int j = 0; j < width ; j ++){
                System.out.print(" "+numbers[i][j]);
            }
            System.out.println("");
        }
    }
}
