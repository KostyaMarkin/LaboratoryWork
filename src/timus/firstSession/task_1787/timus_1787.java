package timus.firstSession.task_1787;

import java.util.Scanner;

public class timus_1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int left = 0;
        for(int i = 0; i<n ; i++){
            int x = in.nextInt();
            left = left + x - k;
            if(left<0){
                left = 0;
            }

        }
        System.out.print(left);
    }
}
