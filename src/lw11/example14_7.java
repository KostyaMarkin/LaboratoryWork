package lw11;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example14_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String stroka = "Первая строка для проверки;" +
                "Вторая строка для проверки значения больше;" +
                "Третья;" +
                "Заключительная большая строка для проверки на то, что количество символом больше заданного числа";
        List<String> list = List.of(stroka.split(";"));
        System.out.println("Исходные строки:");
        for(String e : list){
            System.out.println(e);
        }
        System.out.println("Введите число для фильтрации строк: ");
        int size = in.nextInt();
        System.out.println("Строки после преобразования:");
        List<String> resultList = stringCheck(list, size);
        for(String e : resultList){
            System.out.println(e);
        }
    }
    public static List<String> stringCheck(List<String> list, int size){
        return list.stream().filter(s -> s.length() > size).collect(Collectors.toList());
    }
}
