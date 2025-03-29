package lw11;

import java.util.*;
import java.util.stream.Collectors;

public class example14_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int count = in.nextInt();
        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();
        System.out.print("Массив чисел: ");
        for(int i = 0; i < count; i++) {
            integerList.add(random.nextInt(1000));
            System.out.println(integerList.get(i));
        }
       List<Integer> integerAfter = sqareList(integerList);
        System.out.print("Список чисел после возведения в квадрат: ");
        for(int i = 0; i < count; i++) {
            System.out.println(integerAfter.get(i));
        }
    }

    public static List<Integer> sqareList(List<Integer>  list){
        return list.stream().map(x -> x*x).collect(Collectors.toList());
    }
}
