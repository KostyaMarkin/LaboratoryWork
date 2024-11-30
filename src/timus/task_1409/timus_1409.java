package timus.task_1409;

import java.util.Scanner;

public class timus_1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int sumCans = a+b-1;
        int harry = sumCans - a;
        int larry = sumCans - b;
        System.out.printf("%d %d", harry, larry);
    }
}
