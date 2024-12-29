package lw3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example14_9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = in.nextInt();
        System.out.print("Размер массива - " + size);
        int[] nums = new int[size];
        Random random = new Random();
        for (int i = 0 ; i <nums.length ; i++){
            nums[i] = random.nextInt( 200);
            System.out.println(" Элемент массива [" + i + "] = " + nums[i]);
        }
        Arrays.sort(nums);
        System.out.println("Произведена сортировка массива");
        for (int i = 0 ; i <nums.length ; i++){
            System.out.println(" Элемент массива [" + i + "] после сортировки равен " + nums[i]);
        }
    }
}
