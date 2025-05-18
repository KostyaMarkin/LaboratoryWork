package lw12.example14_5;

import java.util.Arrays;
import java.util.Random;

class NewThread implements Runnable {
    String name;
    Thread thred;
    Number num;
    int[] numbers;

    NewThread(String threadName, Number num, int... numbers) {
        name = threadName;
        thred = new Thread(this, name);
        this.num = num;
        this.numbers = Arrays.stream(numbers).toArray();
        thred.start();
    }

    public void run() {
        for (int i = 0; i < numbers.length; i++) {
            if (num.max < numbers[i]) {
                num.valueSet =false;
                num.putMax(numbers[i]);
            }
        }
    }
}

class Number{
    int max;
    boolean valueSet = false;

    Number(){
        max = Integer.MIN_VALUE;
    }

    synchronized void putMax(int number) {
        while (!valueSet) {
                System.out.println("записано максимальное " + number);
                max = number;
                valueSet = true;
                notify();
        }
    }
}

public class example14_5 {
    public static void main(String[] args)throws InterruptedException {
        int[] numbers = new int[100];
        Random rnd = new Random();
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.print("Исходный массив:");
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = rnd.nextInt(1000);
            System.out.print(numbers[i] + "; ");
            
        }
        int countelements = numbers.length / cores;
        int[] max = new int[cores];
        int count = 0;
        int[][] numbersSplit = new int[cores][countelements];
        for(int i = 0; i < numbersSplit.length; i++){
            for (int j = 0; j < numbersSplit[i].length; j++){
                numbersSplit[i][j] = numbers[count];
                count++;
            }
        }
        Number num = new Number();
        //Создаём потоки равные количеству ядер.
        NewThread[] threadPool = new NewThread[cores];
        for (int i = 0; i < cores; i++){
            threadPool[i] = new NewThread("Поток №" + i, num,numbersSplit[i]);
            threadPool[i].thred.join();
        }

        System.out.println("Максимальное значение - " + num.max);
    }
}
