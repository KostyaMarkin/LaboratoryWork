package lw5.example14_5;

public class classTest {
    private int number;
    classTest(){
        this.number = 0;
        System.out.println("Конструктор присвоил " + number);
    }
    classTest(int num){
        this.number = checkNumber(num);
        System.out.println("Конструктор присвоил " + number);
    }
    public void setNumberTest(){
        this.number = 0;
        System.out.println("Метод присвоил " + number);
    }
    public void setNumberTest(int num){
        this.number = checkNumber(num);
        System.out.println("Метод присвоил " + number);
    }
    private int checkNumber(int num){
        if(num>100) return 100;
        else return num;
    }
}
