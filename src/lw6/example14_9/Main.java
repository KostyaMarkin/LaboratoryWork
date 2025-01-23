package lw6.example14_9;

public class Main {
    public static void main(String[] args) {
        char[] symbols = new char[]{'A','G','B','t','c'};
        System.out.print("Исходный массив:");
        for(char symbol : symbols){
            System.out.print(symbol + " ");
        }
        symbols = classTest.swapping(symbols);
        System.out.print("Итоговый массив:");
        for(char symbol : symbols){
            System.out.print(symbol + " ");
        }
    }
}
