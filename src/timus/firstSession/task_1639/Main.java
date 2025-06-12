package timus.firstSession.task_1639;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int m,n,sum=0;
        Scanner in = new Scanner(System.in);
        m = in.nextInt();
        n = in.nextInt();
        if(n == 1){
            sum = m-1;

        }else if( m == 1){
            sum = n-1;

        }
        else{
            sum = n*m-1;
        }
        if(sum % 2 ==0) {
            System.out.print("[second]=:]");
        }
            else {
            System.out.print("[:=[first]");
        }



    }
}
