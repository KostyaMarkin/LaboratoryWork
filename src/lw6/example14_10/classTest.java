package lw6.example14_10;

import java.util.Arrays;

public class classTest {
    public static int[] getMaxAndMinArray(int... numbers){
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        int[] result = new int[]{max,min};
        return result;
    }
}
