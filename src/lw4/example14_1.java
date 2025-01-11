package lw4;

import java.util.Scanner;

public class example14_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int figure = 23;
        int i;
                int j;
        int z;

        for(i =1; i<=figure;i++){
            if( i <10){
                System.out.print("номер строки: 0" + i + " ");
            }else{
                System.out.print("номер строки: " + i + " ");
            }
            z = 0;
            for(j =12; j<figure; j++){
                System.out.print("+");
                z = z+1;
            }
            System.out.println(" Количество символов в строке " + z);
        }
    }
}
