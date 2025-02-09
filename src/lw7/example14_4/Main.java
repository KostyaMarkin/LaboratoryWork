package lw7.example14_4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Создаём объект супер класса");
        SuperClassLW superClass = new SuperClassLW();
        System.out.println("Создаём объект первого подкласса");
        OneSubClassLW oneSubClass = new OneSubClassLW('A', "Первый подкласс");
        System.out.println("Создаём объект второго подкласса");
        TwoSubClassLW twoSubClass = new TwoSubClassLW('A', "Первый подкласс",453);
        System.out.println("Копируем");
        TwoSubClassLW copyTwoSubClass = new TwoSubClassLW(twoSubClass);
    }

}
