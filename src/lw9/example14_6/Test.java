package lw9.example14_6;

import java.util.Scanner;
import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        Scanner in = new Scanner(System.in);
        int resultMultiplyKey = 1;
        for(int i = 0; i<=10; i++){
            System.out.print("Введите строку: ");
            String stroka = in.nextLine();
            map.put(i,stroka);
        }
        for(HashMap.Entry<Integer, String> item : map.entrySet()){
            int key = item.getKey();
            String values = item.getValue();
            if(values.length() > 5 & key != 0){
                resultMultiplyKey = resultMultiplyKey * key;
            }
            if(key > 5){
                System.out.printf("Ключ %d  имеет значение: %s \n", key, item.getValue());
            }
        }

        System.out.println("Значение с ключем 0: " +map.get(0));
        System.out.println("Перемноженные ключи с длиной строки > 5: " + resultMultiplyKey);
    }
}
