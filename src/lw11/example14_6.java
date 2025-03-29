package lw11;

import java.util.*;
import java.util.stream.Collectors;

public class example14_6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки деления: ");
        List<Integer> listInteger = new ArrayList<>();
        int koef = in.nextInt();
        System.out.print("Исходный массив: \n");
        for(int i = 0; i < 10; i++){
            listInteger.add(random.nextInt(100));
            if(i + 1 == listInteger.size()) {
                System.out.print(listInteger.get(i) + ";");
            }
            else {
                System.out.print(listInteger.get(i) + ", ");
            }
        }
        List<Integer> resultList = koefList(listInteger,koef);
        System.out.print("Итоговый массив: \n");
        for(int i = 0; i < resultList.size(); i++){
            if(i + 1 == resultList.size()){
                System.out.print(resultList.get(i) + ";");
            }else{
                System.out.print(resultList.get(i) + ", ");
            }
        }
    }

    public static List<Integer> koefList(List<Integer> list, int koef){
        return list.stream().filter(x -> x % koef == 0).collect(Collectors.toList());
    }
}
