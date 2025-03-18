package lw10.JSON;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;

public class JSONexample14_2 {
    public static void main(String[] args) {
        try{
            JSONParser parser = new JSONParser();
            Object obj = parser.parse(new FileReader("src/lw10/test/JSON/example.json"));
            JSONObject jsonObject = (JSONObject) obj;
            System.out.println("Корневой элемент " + jsonObject.keySet().iterator().next());
            JSONArray jsonArray = (JSONArray) jsonObject.get("books");
            JSONObject newBook = new JSONObject();
            newBook.put("title","Ревизор");
            newBook.put("author","Николай Васильевич Гоголь");
            newBook.put("year","1835");
            jsonArray.add(newBook);
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
