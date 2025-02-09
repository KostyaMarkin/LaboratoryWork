package lw7.example14_5;

public class Main {
    public static void main(String[] args) {
        SuperClassLW superClass = new SuperClassLW("Новый класс");
        System.out.println(superClass.GetInfoClass());
        SubClassOne subClassOne = new SubClassOne("Первый подкласс", 213);
        System.out.println(subClassOne.GetInfoClass());
        SubClassTwo subClassTwo = new SubClassTwo("Второй подкласс", 'h');
        System.out.println(subClassTwo.GetInfoClass());
    }
}
