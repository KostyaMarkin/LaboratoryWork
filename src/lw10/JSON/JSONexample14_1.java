package lw10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Scanner;
import java.util.stream.Stream;

public class JSONexample14_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lw10/test/JSON/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Введите название книги для поиска: ");
            String nameBook = in.nextLine();
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            Stream<JSONObject> stream = jsonArray.stream();
            stream.filter(book -> book instanceof JSONObject)
                    .map(book -> (JSONObject) book)
                    .filter(book -> nameBook.equals(book.get("title")))
                    .forEach(book -> {
                        System.out.println("Текущий элемент: book");
                        System.out.println("Название книги: " + book.get("title"));
                        System.out.println("Автор: " + book.get("author"));
                        System.out.println("Год издания: " + book.get("year"));
                    });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
