package lw6.example14_1;

public class classTest {
    private char symbol;
    private String stroka;

    public void setClassTest(char symbol){
        this.symbol = symbol;
    }
    public void setClassTest(String str){
        this.stroka = str;
    }
    public void setClassTest(char[] str){
        if(str.length <= 1 ){
            symbol = str[0];
        }
        else {
            stroka ="";
            for(char sym : str){
                stroka += sym;
            }
        }
    }
}
