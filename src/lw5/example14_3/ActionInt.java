package lw5.example14_3;

public class ActionInt {
    private int numberOne;
    private int numberTwo;

    ActionInt(){
        System.out.print("Создание объекта без аргументов");
    }
    ActionInt(int number){
        numberOne = number;
        System.out.print("Создание объекта c 1 аргументов");
    }
    ActionInt(int numberOne, int numberTwo){
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        System.out.print("Создание объекта с 2-мя аргументами");
    }
}
