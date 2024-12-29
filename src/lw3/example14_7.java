package lw3;

import java.util.Scanner;

public class example14_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int countSimbol = in.nextInt();
        char[] simbol = new char[countSimbol];
        int code = 1072;
        for(int i = 0; i<simbol.length;i++){
            simbol[i] =(char) code;
            code += 2;
        }
        for(int i = 0; i<simbol.length;i++){
            System.out.print(simbol[i] + ", ");
        }
        System.out.println(" ");
        for(int i = simbol.length-1; i >= 0;i--){
            System.out.print(simbol[i] + ", ");
        }

    }
}
