package timus.task_1877;

import java.util.Scanner;

public class timus_1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        if( number1 % 2 == 0 || number2%2!=0 ){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
