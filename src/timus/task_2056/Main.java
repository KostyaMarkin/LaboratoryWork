package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        int[] itog = new int[n];
        int count3=0;
        int count4=0;
        int count5=0;
        double sum =0;
        for(int i =0; i < n; i++){
            itog[i] = in.nextInt();
            sum += itog[i];
            if(itog[i] == 3){
                count3++;
            }
            if(itog[i] == 4){
                count4++;
            }
            if(itog[i] == 5){
                count5++;
            }
        }
        if(count3 > 0){
            System.out.print("None");
        }else if(count5 == n){
            System.out.print("Named");
        }else if( sum / n >= 4.5){
            System.out.print("High");
        }else System.out.print("Common");
    }
}
