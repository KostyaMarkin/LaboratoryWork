package lw9.example14_8;

public class Main {
    public static void main(String[] args) {
        List myList = new List();
        myList.createHead("Создание нового списка", "С разными строками", "Разным количеством", "Разной длины");
        System.out.println(myList.toString());
        System.out.println("Добавление в список строки \"Добавил строку в начало\"");
        myList.AddFirst("Добавил строку в начало");
        System.out.println("Добавление в список строки \"Добавил строку в конец\"");
        myList.AddLast("Добавил строку в конец");
        System.out.println(myList.toString());
        System.out.println("Удалил 1 строку");
        myList.RemoveFirst();
        System.out.println("Удалил последнюю строку");
        myList.RemoveFirst();
        System.out.println(myList.toString());
        System.out.println("Удалил строку по номеру 3");
        myList.RemoveIndexOf(3);
        System.out.println(myList.toString());
        List newListRec = new List();
        newListRec.createHeadRec("Создание нового списка", "С разными строками", "Разным количеством", "Разной длины");
        System.out.println(newListRec.toStringRec());
    }
}
