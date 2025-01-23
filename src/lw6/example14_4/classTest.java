package lw6.example14_4;

public class classTest {
    public static int getDoubleFactorial(int number){
        int result = 1;
        if(number % 2 == 0){
            for(; number >2;number-=2){
                result *= number;
            }
            return result;
        }
        for(; number >1;number-=2){
            result *= number;
        }
        return result;
    }
}
