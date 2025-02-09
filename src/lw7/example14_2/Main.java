package lw7.example14_2;

public class Main {
    public static void main(String[] args) {
        int number;
        String stroka;
        System.out.println("Начало выполнения программы");
        SuperClassLW superClassLW = new SuperClassLW("Создание через конструктор супер класса");
        SubClassLW subClassLW1 = new SubClassLW("Создание через конструктор подкласса", 3);
        subClassLW1.SetClassLW();
        number = subClassLW1.GetNum();
        stroka = subClassLW1.GetString();
        System.out.println("Данные класса" + subClassLW1.getClass().getSimpleName() + " строка: " + stroka + ", число " + number);
        subClassLW1.SetClassLW("Новая строка");
        number = subClassLW1.GetNum();
        stroka = subClassLW1.GetString();
        System.out.println("Данные класса" + subClassLW1.getClass().getSimpleName() + " строка: " + stroka + ", число " + number);
        subClassLW1.SetClassLW("Новая строка и число", 23);
        number = subClassLW1.GetNum();
        stroka = subClassLW1.GetString();
        System.out.println("Данные класса" + subClassLW1.getClass().getSimpleName() + " строка: " + stroka + ", число " + number);
    }
}
