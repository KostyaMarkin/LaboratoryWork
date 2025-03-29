package lw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example14_8 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки минимального значения: ");
        List<Integer> listInteger = new ArrayList<>();
        int koef = in.nextInt();
        System.out.print("Исходный массив: \n");
        for(int i = 0; i < 10; i++){
            listInteger.add(random.nextInt(100));
            System.out.print(listInteger.get(i) + ", ");
        }
        List<Integer> resultList = checkListIntegerMin(listInteger,koef);
        System.out.print("Итоговый массив: \n");
        for(int i = 0; i < resultList.size(); i++){
            if(i + 1 == resultList.size()){
                System.out.print(resultList.get(i) + ";");
            }else{
                System.out.print(resultList.get(i) + ", ");
            }
        }
    }

    public static List<Integer> checkListIntegerMin(List<Integer> list, int minNumber){
        return list.stream().filter(x -> x > minNumber).collect(Collectors.toList());
    }
}
