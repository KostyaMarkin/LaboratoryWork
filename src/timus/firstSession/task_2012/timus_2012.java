package timus.firstSession.task_2012;

import java.util.Scanner;

public class timus_2012 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int f = in.nextInt();
        int difference = 12 - f;
        int time = difference*45;
        String result = time <= 240 ? "YES" : "NO";
        System.out.println(result);
    }
}
