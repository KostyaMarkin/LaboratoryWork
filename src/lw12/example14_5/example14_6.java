package lw12.example14_5;

import java.util.Arrays;
import java.util.Random;

class NewThreadSum implements Runnable {
    String name;
    Thread thred;
    NumberSum num;
    int[] numbers;

    NewThreadSum(String threadName, NumberSum num, int... numbers) {
        name = threadName;
        thred = new Thread(this, name);
        this.num = num;
        this.numbers = Arrays.stream(numbers).toArray();
        thred.start();
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        num.putSumm(sum);
    }
}

class NumberSum{
    int resultSumm;
    boolean valueSet = false;

    NumberSum(){
        resultSumm = 0;
    }

    synchronized void putSumm(int number) {
        while (!valueSet) {
            resultSumm += number;
            valueSet = true;
            notify();
        }
    }
}

public class example14_6 {
    public static void main(String[] args)throws InterruptedException {
        int[] numbers = new int[20];
        Random rnd = new Random();
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.print("Исходный массив:");
        for(int i = 0 ; i < numbers.length; i++){
            numbers[i] = rnd.nextInt(1000);
            System.out.print(numbers[i] + "; ");

        }
        int countelements = numbers.length / cores;
        int count = 0;
        int[][] numbersSplit = new int[cores][countelements];
        for(int i = 0; i < numbersSplit.length; i++){
            for (int j = 0; j < numbersSplit[i].length; j++){
                numbersSplit[i][j] = numbers[count];
                count++;
            }
        }
        NumberSum num = new NumberSum();
        //Создаём потоки равные количеству ядер.
        NewThreadSum[] threadPool = new NewThreadSum[cores];
        for (int i = 0; i < cores; i++){
            threadPool[i] = new NewThreadSum("Поток №" + i, num,numbersSplit[i]);
            threadPool[i].thred.join();
        }
        System.out.println("\nСумма чисел " + num.resultSumm);
    }
}
