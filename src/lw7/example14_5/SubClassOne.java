package lw7.example14_5;


public class SubClassOne extends SuperClassLW{
     private int number;

     SubClassOne(String str, int num){
         super(str);
         number = num;
     }
     @Override
    public String GetInfoClass(){
        return "Класс " + this.getClass().getSimpleName() + " переменная stroka = " + GetStringClass() + ", переменная number = " + number;
    }
}
