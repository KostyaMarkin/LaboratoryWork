package lw6.example14_8;

public class classTest {
    public static double getAverenge(int... args){
        double sum = 0;
        double count = 0;
        for(int number : args){
            count++;
            sum += number;
        }
        double result = sum/count;
        return result;
    }
}
