package timus.task_1068;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        if(n<1){
            for(; n <= 1; n++)
                sum += n;
        }else{
            for(int i =1; i <= n; i++){
                sum += i;
            }
        }
        System.out.print(sum);
    }
}
