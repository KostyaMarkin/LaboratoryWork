package lw7.example14_4;

public class SuperClassLW {
    public char symbolOneClass;

    SuperClassLW(){
        symbolOneClass = 'A';

    }
    SuperClassLW(char symbol){
        symbolOneClass = symbol;
    }

    SuperClassLW(SuperClassLW original){
        symbolOneClass = original.symbolOneClass;
    }
}
