package lw5.example14_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Добро пожаловать, пожалуйста введите символ:");
        ActionString actionString = new ActionString();
        String text = in.nextLine();
        actionString.setSymbol(text.charAt(0));
        System.out.println("Вывод кода символа: " + actionString.getIdSymbol());
        actionString.printSymbol();
    }

}
