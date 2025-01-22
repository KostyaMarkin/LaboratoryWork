package lw5.example14_2;

import lw5.example14_1.ActionString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ActionChar action = new ActionChar();
        System.out.println("Программа вывода символо между двумя символами.");
        System.out.print("Введите символ начала: ");
        String start = in.nextLine();
        action.setSymbolStart(start.charAt(0));
        System.out.print("Введите символ конца: ");
        String end = in.nextLine();
        action.setSymbolEnd(end.charAt(0));
        action.printAllSymbol();
    }
}
