package lw5.example14_6;

public class classTest {
    private int max;
    private int min;

    classTest(int numberA){
        min = checkMinNumber(min, numberA);
        max = checkMaxNumber(max, numberA);
    }
    classTest(int numberA, int numberB){
        min = checkMinNumber(min, numberA);
        min = checkMinNumber(min, numberB);
        max = checkMaxNumber(max, numberA);
        max = checkMaxNumber(max, numberB);
    }
    public void setMaxAndMin(int numberA){
        min = checkMinNumber(min, numberA);
        max = checkMaxNumber(max, numberA);
    }
    public void setMaxAndMin(int numberA, int numberB) {
        min = checkMinNumber(min, numberA);
        min = checkMinNumber(min, numberB);
        max = checkMaxNumber(max, numberA);
        max = checkMaxNumber(max, numberB);
    }
    private int checkMinNumber(int a, int b){
        if(a < b) return a;
        else return b;
    }
    private int checkMaxNumber(int a, int b){
        if(a > b) return a;
        else return b;
    }

    public void outMaxAndMin(){
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }

}
