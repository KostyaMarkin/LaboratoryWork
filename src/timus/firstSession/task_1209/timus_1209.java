package timus.firstSession.task_1209;

import java.util.Scanner;

public class timus_1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        for(long i = 0; i < n; i++){
            long x = in.nextLong() - 1;
            long y = (long) Math.sqrt(8*x+1);
            if( y*y == (8*x+1)){
                System.out.print("1 ");
            }else{
                System.out.print("0 ");
            }
        }
    }
}
