package lw7.example14_4;

public class OneSubClassLW extends SuperClassLW {
    public String stroka;

    OneSubClassLW(){
        stroka = "Значение по умлочанию";
    }

    OneSubClassLW(String str){
        stroka = str;
    }

    OneSubClassLW(char symbol){
        super(symbol);
    }

    OneSubClassLW(char symbol, String str){
        super(symbol);
        stroka = str;
    }

    OneSubClassLW(OneSubClassLW original){
        super(original.symbolOneClass);
        stroka = original.stroka;
    }
}
