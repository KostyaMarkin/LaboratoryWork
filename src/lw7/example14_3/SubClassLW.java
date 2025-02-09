package lw7.example14_3;

public class SubClassLW extends SuperClassLW {
    public String stroka;

    SubClassLW(int num, String str){
        super(num);
        stroka = str;
    }

    public void SetClassLW(int num, String str){
        super.number = num;
        stroka = str;
    }
    @Override
    public String toString(){
        String info = "Класс: " +
                this.getClass().getSimpleName() +
                " имеет данные: " +
                " число number:" + number +
                " строка stroka: " + stroka +
                ".";
        return info;
    }
}
