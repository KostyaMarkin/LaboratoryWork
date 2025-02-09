package lw7.example14_1;

public class Main {
    public static void main(String[] args) {
        SuperClassTest superClassObject1 =
                new SuperClassTest("Передал в конструктор суперкласса");
        String className = superClassObject1.toString();
        System.out.println(className);

        SubClassTest subClasObject2 =
                new SubClassTest("Передал в конструктор подкласса");
        String subClassName1 = subClasObject2.toString();
        System.out.println(subClassName1);

        SubClassTest subClasObject3 =
                new SubClassTest("Передал в конструктор подкласса", " где 2 параметра");
        String subClassName2 = subClasObject3.toString();
        System.out.println(subClassName2);
    }
}
