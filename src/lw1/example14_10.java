package lw1;
import java.time.LocalDate;
import java.util.Scanner;

public class example14_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate dateNow = LocalDate.now();
        System.out.print("Input your year birthday: ");
        int yearBirthday = in.nextInt();
        int age =  dateNow.getYear() - yearBirthday;
        System.out.printf("Your age: %d",age);
    }
}
