package lw13;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

class Sum{
    int[] numbers;
    int sum;
    int sred;

    Sum(int... numbers){
        this.numbers = Arrays.stream(numbers).toArray();
    }

    public void CalcSum(){
        try{
            for(int i=0; i<= numbers.length; i++) {
                if(numbers[i] > 0) {
                    sum += numbers[i];
                }
            }
            if (sum <=1){
                throw new Exception("Отсутствуют положительные числа");
            }
            sred = sum / numbers.length;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Выход за границы массива!\n" + e.getMessage());
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    public int GetSum(){
        return sum;
    }

}
public class example14_15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество элементов");
        int count =Integer.parseInt(in.nextLine());
        int[] numbers = new int[count];
        for( int i = 0; i < numbers.length; i++){
            try {
                numbers[i] = in.nextInt();
            }catch (InputMismatchException ex){
                numbers[i] = 0;
                i--;
                System.out.println("Не верное приведение типов");
                in.next();
            }
        }
        Sum newSum = new Sum(numbers);
        newSum.CalcSum();
        System.out.println("Сумма массива = "+newSum.GetSum());
    }
}
