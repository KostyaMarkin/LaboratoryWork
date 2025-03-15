package lw9.example14_9;

import java.util.LinkedHashSet;

public class TestLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<Integer> LinkedHashSet = new LinkedHashSet<>();
        System.out.println("Время на добавление в начало: " + testAdd(LinkedHashSet));
        System.out.println("Время на удаление начала: " + testRemove(LinkedHashSet));
        LinkedHashSet.clear();
        System.out.println("Время на поиск: " + testPoisk(LinkedHashSet));
    }

    public static long testAdd(LinkedHashSet list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 14000000;i++){
            list.add("" + i);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testRemove(LinkedHashSet list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 1400; i++){
            list.remove(""+i);
        }
        long end = System.nanoTime();
        return  end-start;
    }


    public static long testPoisk(LinkedHashSet list){

        for(int i = 0; i <= 14000000;i++){
            list.add(i);
        }
        long start= System.nanoTime();
        list.contains(list.size()/2);
        long end = System.nanoTime();
        return  end-start;
    }
}
