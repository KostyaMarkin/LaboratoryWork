package lw9.example14_9;

import java.util.LinkedHashMap;

public class TestLinkedhashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> LinkedHashMap = new LinkedHashMap<>();
        System.out.println("Время на добавление в начало: " + testAdd(LinkedHashMap));
        System.out.println("Время на удаление начала: " + testRemove(LinkedHashMap));
        LinkedHashMap.clear();
        System.out.println("Время на добавление в середину: " + testAddSeredyna(LinkedHashMap));
        System.out.println("Время на удаление середины: " + testRemoveSeredyna(LinkedHashMap));
        LinkedHashMap.clear();
        System.out.println("Время на добавление в конец: " + testAddTail(LinkedHashMap));
        System.out.println("Время на удаление конца: " + testRemoveTail(LinkedHashMap));
        LinkedHashMap.clear();
        System.out.println("Время на поиск: " + testPoisk(LinkedHashMap));
    }

    public static long testAdd(LinkedHashMap list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 14000000;i++){
            list.put(i,i);
        }
        long end = System.nanoTime();
        return  end-start;
    }
    public static long testAddTail(LinkedHashMap list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 14000000;i++){
            list.put(i,list.size()-1);
        }
        long end = System.nanoTime();
        return  end-start;
    }
    public static long testAddSeredyna(LinkedHashMap list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 14000000;i++){
            list.put(i,list.size()/2);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testRemove(LinkedHashMap list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 1400; i++){
            list.remove(i);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testRemoveSeredyna(LinkedHashMap list){
        long start =  System.nanoTime();
        for(int i = 1400; i >= 0; i--){
            list.remove(list.size()/2 - 1);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testRemoveTail(LinkedHashMap list){
        long start =  System.nanoTime();
        for(int i = 1400; i >= 0; i--){
            list.remove(list.size()-1);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testPoisk(LinkedHashMap list){

        for(int i = 0; i <= 14000000;i++){
            list.put(i,list.size()-1);
        }
        long start= System.nanoTime();
        list.get(list.size()/2);
        long end = System.nanoTime();
        return  end-start;
    }
}
