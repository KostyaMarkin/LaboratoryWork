package lw7.example14_4;

public class TwoSubClassLW extends OneSubClassLW {
    public int number;

    TwoSubClassLW(){

    }

    TwoSubClassLW(int num){
        number = num;

    }
    TwoSubClassLW(char symbol){
        super(symbol);
    }
    TwoSubClassLW(String str1){
        super(str1);
    }
    TwoSubClassLW(int number, char symbol){
        super(symbol);
        this.number = number;
    }
    TwoSubClassLW(int number, String str1){
        super(str1);
        this.number = number;
    }
    TwoSubClassLW(char symbol, String str1){
        super(symbol, str1);
    }
    TwoSubClassLW(char symbol, String str1, int number){
        super(symbol, str1);
        this.number = number;
    }
    TwoSubClassLW(TwoSubClassLW original){
        super(original.symbolOneClass,original.stroka);
        this.number = original.number;
    }
}
