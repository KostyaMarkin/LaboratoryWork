package lw7.example14_2;

public class SubClassLW extends SuperClassLW {
    public int number;

    SubClassLW(String str, int count){
        super(str);
        this.number = count;
    }

    public void SetClassLW(){
        super.SetClassLW("Без параметров");
    }

    public void SetClassLW(String str){
        super.SetClassLW(str);;
    }

    public void SetClassLW(int num){
        this.number = num;
    }

    public void SetClassLW(String str, int num){
        super.SetClassLW(str);
        this.number = num;
    }

    public int GetNum(){
        return this.number;
    }
}
