package lw7.example14_3;

public class SuperClassLW {
    public int number;

    SuperClassLW(int num){
        this.number = num;
    }

    public void SetClassLW(int num){
        number = num;
    }

    @Override
    public String toString(){
        String info = "Класс: " +
                this.getClass().getSimpleName() +
                " имеет данные: " +
                " число number:" + number+
                ".";
        return info;
    }
}
