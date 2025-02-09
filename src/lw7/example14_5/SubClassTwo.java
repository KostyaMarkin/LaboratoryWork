package lw7.example14_5;

public class SubClassTwo extends SuperClassLW {
    private char symbol;

    SubClassTwo(String str, char sym){
        super(str);
        symbol= sym;
    }
    @Override
    public String GetInfoClass(){
        System.out.println("Суперкласс: "+ super.GetInfoClass());
        return "Класс " + this.getClass().getSimpleName() + " переменная stroka = " + GetStringClass() + ", переменная symbol = " + symbol;

    }
}
