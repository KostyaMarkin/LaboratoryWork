package lw5.example14_1;

public class ActionString {
    private char symbol;

    public void setSymbol(char sim){
        symbol = sim;
    }

    public int getIdSymbol(){
        return symbol;
    }
    public void printSymbol(){
        System.out.println("Символ " + symbol + " имеет код " + (int) symbol);
    }
}
