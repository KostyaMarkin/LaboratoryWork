package lw1;
import java.util.Scanner;

public class example14_8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input day of week: ");
        String dayOfWeek = in.nextLine();
        System.out.print("Input month: ");
        String month = in.nextLine();
        System.out.print("Input day: ");
        int day = in.nextInt();
        System.out.printf("Date: %s, %d %s",dayOfWeek, day, month);
        in.close();
    }
}
