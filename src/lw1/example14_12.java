package lw1;
import java.util.Scanner;
import java.time.LocalDate;

public class example14_12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        LocalDate dateNow = LocalDate.now();
        System.out.print("Input name: ");
        String name = in.nextLine();
        System.out.print("Input year age: ");
        int age= in.nextInt();
        int yearBirthday = dateNow.getYear() - age;
        System.out.printf("%s birthday was in %d",name,yearBirthday);
        in.close();
    }
}
