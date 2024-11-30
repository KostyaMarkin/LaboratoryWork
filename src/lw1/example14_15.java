package lw1;
import java.util.Scanner;

public class example14_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = in.nextInt();
        System.out.print("Input b: ");
        int b = in.nextInt();
        int answerOne =  a + b;
        int answerTwo =  a + b;
        System.out.printf("1) a + b = %d\n2) a - b = %d",answerOne,answerTwo);
        in.close();
    }
}
