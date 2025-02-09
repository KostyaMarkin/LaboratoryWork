package lw7.example14_5;


public class SuperClassLW {
    private String stroka;

    SuperClassLW(String str){
        stroka = str;
    }
    public String GetStringClass(){
        return stroka;
    }

    public String GetInfoClass(){
        return "Класс " + this.getClass().getSimpleName() + " переменная stroka = " + stroka;
    }
}
