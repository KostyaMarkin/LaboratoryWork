package lw9.example14_7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class TestLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество людей: ");
        int n = in.nextInt();
        LinkedList<String> list = new LinkedList<>();
        for(int i = 0; i < n; i++){
            System.out.printf("Введите имя %d: ",i+1);
            list.add(in.next());
        }
        list = DeletedArrayItems(list, 1);

        for(String stroka : list){
            System.out.println(stroka);
        }
    }

    public static LinkedList DeletedArrayItems(LinkedList list, int count) {
        for (int i = 0; i < list.size(); i++) {
            if (count % 2 == 0) {
                list.remove(i);
                i--;
            }
            count++;
        }
        if (list.size() == 1) {
            return list;
        } else {
            list = DeletedArrayItems(list, count);
            return list;
        }
    }
}
