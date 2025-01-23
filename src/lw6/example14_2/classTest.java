package lw6.example14_2;

public class classTest {
    private static int number = 0;
    public static void setStaticNumber(){
        System.out.println("Количество вызовов метода: " + number);
        number++;
    }
}
