package lw1;
import java.util.Scanner;

public class example14_13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        int answer =  a + b;
        System.out.printf("a + b = %d",answer);
        in.close();
    }
}
