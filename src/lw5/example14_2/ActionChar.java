package lw5.example14_2;

public class ActionChar {
    private char symbolStart;
    private char symbolEnd;

    public void setSymbolStart(char symbol){
        symbolStart = symbol;
    }

    public void setSymbolEnd(char symbol){
        symbolEnd = symbol;
    }

    public void printAllSymbol(){
        System.out.print("Выводим всме символы между" + symbolStart + " и " + symbolEnd + ": ");
        int idSymbolStart = symbolStart;
        int idSymbolEnd = symbolEnd;
        while (idSymbolStart <= idSymbolEnd){
            char symbol = (char) idSymbolStart;
            System.out.print(symbol + ",");
            idSymbolStart++;
        }
    }
}
