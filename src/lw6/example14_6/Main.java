package lw6.example14_6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[] {34,25,123,5};
        System.out.print("Введите количество элементов из массива: ");
        int n = in.nextInt();
        numbers = classTest.getNewArray(numbers, n);
        System.out.print("Итоговый массив:");
        for(int i : numbers){
            System.out.print(i + " ");
        }
    }

}
