package timus.task_1876;

import java.util.Scanner;

public class timus_1876 {
    public static void main(String[] args) {
        Scanner inFile = new Scanner(System.in);


        int a = inFile.nextInt();
        int b = inFile.nextInt();

        int max;
        if (39*2 + 40 + (a-40)*2 + 1 > 2*b + 40) {
            max = 39*2 + 40 + (a-40)*2 + 1;
        } else {
            max = 2*b + 40;
        }
        System.out.print(max);
    }
}
