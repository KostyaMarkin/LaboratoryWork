package lw9.example14_9;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.println("Время на добавление в начало: " + testAdd(arrayList));
        System.out.println("Время на удаление начала: " + testRemove(arrayList));
        arrayList.clear();
        System.out.println("Время на добавление в середину: " + testAddSeredyna(arrayList));
        System.out.println("Время на удаление середины: " + testRemoveSeredyna(arrayList));
        arrayList.clear();
        System.out.println("Время на добавление в конец: " + testAddTail(arrayList));
        System.out.println("Время на удаление конца: " + testRemoveTail(arrayList));
        arrayList.clear();
        System.out.println("Время на поиск: " + testPoisk(arrayList));
    }

    public static long testAdd(ArrayList list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 14000000;i++){
            list.add(i);
        }
        long end = System.nanoTime();
        return  end-start;
    }
    public static long testAddTail(ArrayList list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 14000000;i++){
            list.add(i,list.size()-1);
        }
        long end = System.nanoTime();
        return  end-start;
    }
    public static long testAddSeredyna(ArrayList list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 14000000;i++){
            list.add(i,list.size()/2);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testRemove(ArrayList list){
        long start =  System.nanoTime();
        for(int i = 0; i <= 1400; i++){
            list.remove(0);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testRemoveSeredyna(ArrayList list){
        long start =  System.nanoTime();
        for(int i = 1400; i >= 0; i--){
            list.remove(list.size()/2);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testRemoveTail(ArrayList list){
        long start =  System.nanoTime();
        for(int i = 1400; i >= 0; i--){
            list.remove(list.size()/2);
        }
        long end = System.nanoTime();
        return  end-start;
    }

    public static long testPoisk(ArrayList list){

        for(int i = 0; i <= 140000000;i++){
            list.add(i,list.size()-1);
        }
        long start= System.nanoTime();
        list.get(list.size()/2);
        long end = System.nanoTime();
        return  end-start;
    }
}
