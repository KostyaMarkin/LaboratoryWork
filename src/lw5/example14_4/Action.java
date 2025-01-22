package lw5.example14_4;

public class Action {
    private char symbol;
    private int idSymbol;

    Action(int idSymbol, char symbol){
        this.symbol = symbol;
        this.idSymbol = idSymbol;

    }
    Action(double idSymbol){
        int R = (int) idSymbol;
        int id =(int) (idSymbol - R) *100;
        symbol = (char) R;
        this.idSymbol = id;
    }
}
