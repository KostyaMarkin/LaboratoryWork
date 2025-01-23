package lw6.example14_5;

public class classTest {
    public static int getSumSqr(int number){
        int result = 0;
        for(; number >0 ;number--){
            result += Math.pow(number,2);
        }
        return result;
    }
}
