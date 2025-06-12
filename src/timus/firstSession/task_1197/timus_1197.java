package timus.task_1197;

import java.util.Scanner;

public class timus_1197 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int test = in.nextInt();
        int x;
        int y;
        int bingo = 0;
        char x1;
        char y1;
        for(int i = 0; i< test; i++){
            String position = in.next();
            x1 = position.charAt(0);
            y1 = position.charAt(1);
            x = (int) x1-96;
            y = (int) y1-48;
            for(int j = -2; j<=2;j++){
                for(int z = -2; z<= 2; z++){
                    if(z != j){
                        if(x-j > 0  && y -z >0 && x-j < 9 && y-z <9){
                            if(j*j + z*z == 5){
                                bingo++;
                            }
                        }
                    }
                }
            }
            System.out.println(bingo);
            bingo=0;
        }
    }
}
