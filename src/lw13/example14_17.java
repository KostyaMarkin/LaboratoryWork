package lw13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class example14_17 {
    public static void main(String[] args) {
        byte[] byteNum = new byte[5];
        Scanner in = new Scanner(System.in);
        for(int i = 0; i< byteNum.length; i++){
            try{
                System.out.print("Введите число для суммы: ");
                byteNum[i] = in.nextByte();
            }catch (InputMismatchException ex){
                System.out.println("Не верный ввод!");
                i--;
                in.next();
            }
        }
        System.out.println("Считаем сумму.");
        byte sum = 0;
        for(int i = 0; i < byteNum.length; i++){
            try{
                if((byte) (sum + byteNum[i]) < 0 ){
                    throw new ArithmeticException("Выход за границы типа byte");
                }else {
                    sum = (byte) (sum + byteNum[i]);
                }
            }catch (ArithmeticException ex){
                System.out.println("Сумма находится вне диапазона границ типа byte");
                i = byteNum.length + 1;
            }
        }
        System.out.print("Итоговая сумма: " + sum);
    }
}
