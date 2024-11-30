package lw1;
import java.time.LocalDate;
import java.util.Scanner;

public class example14_11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate dateNow = LocalDate.now();
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input year birthday: ");
        int yearBirthday = in.nextInt();
        int age = dateNow.getYear() - yearBirthday;
        System.out.printf("%s is %d years old",name,age);
        in.close();
    }
}
