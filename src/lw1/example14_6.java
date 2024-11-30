package lw1;
import java.util.Scanner;

public class example14_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Familia: ");
        String famale = in.nextLine();
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.print("Otchestvo: ");
        String middlieName = in.nextLine();
        System.out.printf("Hello %s %s %s", famale, name, middlieName);
        in.close();
    }
}