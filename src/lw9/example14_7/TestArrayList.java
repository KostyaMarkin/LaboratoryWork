package lw9.example14_7;

import java.util.ArrayList;
import java.util.Scanner;

public class TestArrayList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество людей: ");
        int n = in.nextInt();
        ArrayList<String> array = new ArrayList<>();
        for(int i = 0; i < n; i++){
            System.out.printf("Введите имя %d: ",i+1);
            array.add(in.next());
        }
        array = DeletedArrayItems(array, 1);

        for(String stroka : array){
            System.out.println(stroka);
        }
    }

    public static ArrayList DeletedArrayItems(ArrayList arrayList,int count) {
        for (int i = 0; i < arrayList.size(); i++) {
                if (count % 2 == 0) {
                    arrayList.remove(i);
                    i--;
                }
            count++;
        }
        if (arrayList.size() == 1) {
            return arrayList;
        } else {
            arrayList = DeletedArrayItems(arrayList, count);
            return arrayList;
        }
    }
}
