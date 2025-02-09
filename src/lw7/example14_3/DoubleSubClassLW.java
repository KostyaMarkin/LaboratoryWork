package lw7.example14_3;

public class DoubleSubClassLW extends SubClassLW {
    public String strokaTwo;

    DoubleSubClassLW(int num, String str1, String str2){
        super(num,str1);
        strokaTwo = str2;
    }

    public void SetClassLW(int num, String str1, String str2){
        number = num;
        stroka = str1;
        strokaTwo =str2;
    }

    @Override
    public String toString(){
        String info = "Класс: " +
                this.getClass().getSimpleName() +
                " имеет данные: " +
                " число number:" + number +
                " строка stroka: " + stroka +
                " строка strokaTwo:" + strokaTwo +
                ".";
        return info;
    }
}
