package lw11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example14_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = "Напишите функцию, которая принимает " +
                "на вход список строк и возвращает новый список, " +
                "содержащий только те строки, которые содержат " +
                "заданную подстроку";
        List<String> strings = List.of(stroka.split(" "));
        System.out.println("Строки после сплитования: \n");
        for(String e : strings){
            System.out.println(e);
        }
        System.out.print("Введите подстроку для поиска:");
        String poisk = in.nextLine();
        List<String> result = filterCapitalizedStrings(strings,poisk);
        System.out.println("Строки после поиска: \n");
        for(String e : result){
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list, String poisk){
        return list.stream()
                .filter(s -> s.contains(poisk))
                .collect(Collectors.toList());
    }
}
