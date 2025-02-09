package lw7.example14_3;

public class Main {
    public static void main(String[] args) {
        SuperClassLW superClassLW = new SuperClassLW(4);
        System.out.println(superClassLW.toString());

        SubClassLW subClassLW = new SubClassLW(3,"новая строка 1");
        System.out.println(subClassLW.toString());
        System.out.println("Изменим данные");
        subClassLW.SetClassLW(100, "Новое значение 1");
        System.out.println(subClassLW.toString());

        DoubleSubClassLW doubleSubClassLWSubClassLW = new DoubleSubClassLW(3,"новая строка 1", "новая строка 2");
        System.out.println(doubleSubClassLWSubClassLW.toString());
        System.out.println("Изменим данные");
        doubleSubClassLWSubClassLW.SetClassLW(100, "Новое значение 1", "Новое значение 2");
        System.out.println(doubleSubClassLWSubClassLW.toString());
    }
}
