package lw11;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example14_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        List<String> list = new ArrayList<String>();
        list.add("Строка без всяких чисел и символов");
        list.add("2 строка");
        list.add("Строка с символами!");
        System.out.println("Исходные строки:");
        for(String e : list){
            System.out.println(e);
        }
        System.out.println("Строки после преобразования:");
        List<String> resultList = stringCheck(list);
        for(String e : resultList){
            System.out.println(e);
        }
    }

    public static List<String> stringCheck(List<String> list){
        return list.stream().filter(s -> s.matches("[а-яА-Я[\\s]]+")).collect(Collectors.toList());
    }
}
