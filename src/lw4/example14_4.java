package lw4;

import java.util.Scanner;

public class example14_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите длину стороны треугольника: ");
        int height = in.nextInt();
        int j = 1;
        int[][] numbers = new int[height][height];
        for (int i = 0; i < height; i++) {
            int z = 0;
            do {
                numbers[i][z] = 2;
                z = z + 1;
            } while (z < j);
            j = j + 1;
        }
        for(int[] row : numbers){
            for(int element : row){
                if(element != 0)System.out.print(element);
            }
            System.out.println("");
        }
    }
}

