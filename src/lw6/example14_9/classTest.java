package lw6.example14_9;

public class classTest {
    public static char[] swapping(char[] symbolsOld){
        int count = symbolsOld.length - 1;
        int j = count;
        char[] newSymbols = new char[count+1];
        for(int i = 0;i < symbolsOld.length; i++) {
            if (i == j) {
                newSymbols[i] = symbolsOld[j];
                newSymbols[j] = symbolsOld[i];
                return newSymbols;
            } else {
                newSymbols[i] = symbolsOld[j];
                newSymbols[j] = symbolsOld[i];
                j--;
            }
        }
        return newSymbols;
    }
}
