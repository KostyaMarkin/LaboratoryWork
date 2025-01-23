package lw6.example14_3;

import java.util.Arrays;

public class classTest {
    public static int getMax(int... args){
       return Arrays.stream(args).max().getAsInt();
    }
    public static int getMin(int... args){
        return Arrays.stream(args).min().getAsInt();
    }
    public static double getAverenge(int... args){
        return Arrays.stream(args).average().getAsDouble();
    }
}
