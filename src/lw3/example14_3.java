package lw3;

import java.util.Scanner;

public class example14_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество последовательности: ");
        int number = in.nextInt();
        int[] fibonachi = new int[number];
        fibonachi[0] = 1;
        fibonachi[1] = 1;
        for(int i = 2; i < fibonachi.length; i++){
            fibonachi[i] = fibonachi[i-1] + fibonachi[i-2];
        }
        int count = 0;
        do{
            System.out.print(fibonachi[count] + ", ");
            count++;
        }while(count < fibonachi.length);
    }
}
