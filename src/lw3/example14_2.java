package lw3;

import java.util.Scanner;

public class example14_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите день недели: ");
        String day = in.nextLine();
        switch (day) {
            case "Понедельник":
                System.out.println("День недели " + day + " по порядку идёт 1");
                break;
            case "Вторник":
                System.out.println("День недели " + day + " по порядку идёт 2");
                break;
            case "Среда":
                System.out.println(" День недели " + day + " по порядку идёт3");
                break;
            case "Четверг":
                System.out.println(" День недели " + day + " по порядку идёт 4");
                break;
            case "Пятница":
                System.out.println("День недели " + day + " по порядку идёт 5");
                break;
            case "Суббота":
                System.out.println("День недели " + day + " по порядку идёт 6");
                break;
            case "Воскресенье":
                System.out.println("День недели " + day + " по порядку идёт 7");
                break;
            default:
                System.out.println("Введен не верный день недели");
                break;
        }
    }
}
