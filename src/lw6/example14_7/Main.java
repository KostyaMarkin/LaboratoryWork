package lw6.example14_7;

public class Main {
    public static void main(String[] args) {
        char[] symbols = new char[]{'A','G','B','t','c'};
        int[] codeSymbols = classTest.getCodeSymbol(symbols);
        for(int id : codeSymbols){
            System.out.print(id + " ");
        }
    }

}
