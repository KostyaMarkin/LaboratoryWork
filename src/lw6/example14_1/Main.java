package lw6.example14_1;

public class Main {
    public static void main(String[] args) {
        classTest test = new classTest();
        test.setClassTest('a');
        test.setClassTest("Привет мир");
        char[] symbols = new char[] {'П','р','в','д'};
        test.setClassTest(symbols);
    }
}
