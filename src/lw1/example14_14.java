package lw1;
import java.util.Scanner;

public class example14_14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        float number = in.nextFloat();
        float answerOne = number - 1;
        float answerTwo = number + 1;
        double answerThree = Math.pow(answerOne+answerTwo+number,2);
        System.out.printf("1) %.2f \n2 %.2f\n3) %.2f\n4)%.2f)",answerOne,number,answerTwo, answerThree);
    }
}
