package lw11;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class example14_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива ");
        int count = in.nextInt();
        int[] arr = new int[count];
        Random random = new Random();
        for(int i = 0; i < count; i++){
            arr[i] = random.nextInt(0,1000);

        }
        System.out.println("Массив arr: ");
        System.out.println(Arrays.toString(arr));
        int[] arrResult = filterEvenNumbers(arr);
        System.out.println("Массив arrResult: ");
        System.out.println(Arrays.toString(arrResult));
    }

    public static int[] filterEvenNumbers(int[] arr){
        return Arrays.stream(arr).filter(x -> x % 2 == 0).toArray();
    }
}
