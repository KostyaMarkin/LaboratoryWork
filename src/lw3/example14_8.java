package lw3;

import java.util.Scanner;

public class example14_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int countArray = in.nextInt();
        char[] simbol = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] rightSimbol = "BCDFGHJKLMNPQRSTVWXZ".toCharArray();
        char[] result = new char[countArray];
        int index = 0;
        for(char letter: simbol){
            if(index == countArray){
                break;
            }
            for(char rightletter: rightSimbol) {
                if (letter == rightletter) {
                    result[index] = letter;
                    index++;
                }
            }
        }
        for(char letter: result){
            System.out.print(letter + " ");
        }
    }
}
