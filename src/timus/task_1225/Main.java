package timus.task_1225;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum,varOne,varTwo;
        varOne =2;
        sum = 2;
        int n = in.nextInt();
        if (n <= 2 ) {
            System.out.print(2);
        }else{
            for(int i =3; i<= n; i++){
                varTwo=varOne;
                varOne=sum;
                sum=varOne+varTwo;
            }
            System.out.print(sum);
        }

    }
}
