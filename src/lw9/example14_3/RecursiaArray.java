package lw9.example14_3;

import java.util.Scanner;

public class RecursiaArray {
    public static void main(String[] args) {
        System.out.print("Введите количество элементов массива: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrayNumbers = new int[n];
        arrayNumbers = EnterArray(arrayNumbers,0);
        OutArray(arrayNumbers , 0);
    }

    public static int[] EnterArray(int[] array, int i){
        if(i >= array.length) {
            return array;
        }else{
            Scanner in = new Scanner(System.in);
            int number = in.nextInt();
            array[i] = number;
            i++;
            return EnterArray(array, i);
        }
    }

    public static void OutArray(int[] array ,int i){
        if( i >= array.length){
            return;
        }else{
            System.out.print(" " + array[i]);
            i++;
            OutArray(array,i);
        }
    }
}
