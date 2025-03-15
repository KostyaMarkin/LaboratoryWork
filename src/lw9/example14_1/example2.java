package lw9.example14_1;

public class example2 {
    public static void main(String[] args) {
        m(1);
    }

    public static void m(int x){

        if((2 * x + 1)< 20 ){
            m(2 * x + 1);
        }
        System.out.print("x=" + x + "\n");
    }
}
