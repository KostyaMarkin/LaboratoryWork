package lw1;
import java.util.Scanner;

public class example14_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input month: ");
        String month = in.nextLine();
        System.out.print("Input day in month: ");
        int dayInMonth = in.nextInt();
        System.out.printf("In month %s %d days",month, dayInMonth);
        in.close();

    }
}
