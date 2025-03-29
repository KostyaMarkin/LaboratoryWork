package lw11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class example14_10 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число для проверки максимального значения: ");
        List<Integer> listInteger = new ArrayList<>();
        int max = in.nextInt();
        System.out.print("Исходный массив: \n");
        for(int i = 0; i < 10; i++){
            listInteger.add(random.nextInt(100));
            System.out.print(listInteger.get(i) + ", ");
        }
        List<Integer> resultList = checkListIntegerMax(listInteger,max);
        System.out.print("Итоговый массив: \n");
        for(int i = 0; i < resultList.size(); i++){
            if(i + 1 == resultList.size()){
                System.out.print(resultList.get(i) + ";");
            }else{
                System.out.print(resultList.get(i) + ", ");
            }
        }
    }

    public static List<Integer> checkListIntegerMax(List<Integer> list, int maxNumber){
        return list.stream().filter(x -> x < maxNumber).collect(Collectors.toList());
    }
}
