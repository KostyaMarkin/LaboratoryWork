package lw9.example14_1;

public class example1 {
    public static void main(String[] args) {
        m(1);
    }

    public static void m(int x){
        System.out.print("x=" + x + "\n");
        if((2 * x + 1)< 20 ){
            m(2 * x + 1);
        }
    }
}
