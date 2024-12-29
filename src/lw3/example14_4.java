package lw3;

import java.util.Scanner;

public class example14_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 целых числа");
        System.out.print("a: ");
        int a = in.nextInt();
        System.out.print("b: ");
        int b = in.nextInt();
        int minNum = 0;
        int maxNum = 0;
        if(a>b){
            minNum = b;
            maxNum = a;
        }
        else{
            minNum = a;
            maxNum = b;
        }
        int[] number = new int[maxNum - minNum + 1];
        int i = 0;
        number[i] = minNum;
        do{
            i++;
            number[i] = number[i-1]+1;
        }while (number[i]<=maxNum-1);
        for(int j = 0; j<number.length;j++){
            System.out.print(number[j] + ", ");
        }
    }
}
