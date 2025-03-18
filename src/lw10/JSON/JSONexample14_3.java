package lw10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Stream;

public class JSONexample14_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lw10/test/JSON/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Введите название книги для удаления: ");
            String nameBook = in.nextLine();
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            Iterator iterator = jsonArray.iterator();
            while(iterator.hasNext()){
                JSONObject book = (JSONObject) iterator.next();
                if(nameBook.equals(book.get("title"))){
                    iterator.remove();
                }
            }
            jsonObject.clear();
            jsonObject.put("books",jsonArray);
            try(FileWriter file = new FileWriter("src/lw10/test/JSON/example.json")){
                file.write(jsonObject.toJSONString());
                System.out.println("Json успешно создан!");

            }catch (Exception e){
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
