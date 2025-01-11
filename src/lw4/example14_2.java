package lw4;

public class example14_2 {
    public static void main(String[] args) {
        int height = 10;
        int j = 0;
        for (int i = 0; i < height ; i ++){
            int z = 1;
            j = j + 1;
            do {
                System.out.print("+");
                z = z +1;
            }while (z<=j);
            System.out.println(" ");
        }
    }
}
