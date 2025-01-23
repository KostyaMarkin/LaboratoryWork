package lw6.example14_7;

public class classTest {
    public static int[] getCodeSymbol(char[] symbols){
        int[] codeSymbols = new int[symbols.length];
        int i = 0;
        for(char symbol : symbols){
            codeSymbols[i] = (int) symbol;
            i++;
        }
        return codeSymbols;
    }
}
