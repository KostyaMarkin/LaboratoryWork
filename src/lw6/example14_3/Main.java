package lw6.example14_3;

public class Main {
    public static void main(String[] args) {
        int max = classTest.getMax(123,10);
        int min = classTest.getMin(123,10,45,1234,56,1203);
        int[] numbers = new int[] {43,23,54,120};
        double averenge = classTest.getAverenge(numbers);
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Averenge = " + averenge);
    }
}
