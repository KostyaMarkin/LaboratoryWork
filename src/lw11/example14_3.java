package lw11;

import java.util.List;
import java.util.stream.Collectors;

public class example14_3 {
    public static void main(String[] args) {
        String stroka = "Напишите функцию, которая принимает на вход" +
                " список строк и возвращает новый список, " +
                "содержащий только те строки, которые начинаются с " +
                "большой буквы.";
        List<String> strings = List.of(stroka.split(" "));
        System.out.println("Строки после сплитования: \n");
        for(String e : strings){
            System.out.println(e);
        }
        List<String> result = filterCapitalizedStrings(strings);
        System.out.println("Строки после преобразования: \n");
        for(String e : result){
            System.out.println(e);
        }
    }

    public static List<String> filterCapitalizedStrings(List<String> list){
        return list.stream()
                .filter(s -> Character.isUpperCase(s.charAt(0)))
                .collect(Collectors.toList());
    }
}
