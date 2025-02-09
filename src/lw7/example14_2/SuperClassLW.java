package lw7.example14_2;

public class SuperClassLW {
    private String stroka;

    SuperClassLW(String str) {
        this.stroka = str;
    }

    public int GetLength() {
        return this.stroka.length();
    }


    public void SetClassLW() {
        this.stroka = "Без параметров";
    }

    public void SetClassLW(String stroka) {
        this.stroka = stroka;
    }
    public String GetString(){
        return this.stroka;
    }
}