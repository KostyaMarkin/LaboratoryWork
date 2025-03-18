package lw10.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.List;

public class HTMLexample14_1 {
    public static void main(String[] args) throws IOException{

        String url = "https://www.e1.ru/horoscope/daily/";
        BufferedWriter bufWriter = null;
        String path = SetNewFile("src/lw10/HTML/horoscope.txt");
        try{
            bufWriter = new BufferedWriter( new OutputStreamWriter(new FileOutputStream(path),"cp1251"));
            try {
                Document doc = connectToURL(url);
                Elements newParent = doc.select("#app > div.global-wrapper > div.app-content > div > div.inner-columns-wrapper > div.central-right-wrapper > div.central-column-container > section");
                List<Node> nodes = newParent.get(0).childNodes();
                for(int i = 2; i < nodes.size(); i++){
                    System.out.println("Знак зодиака: " + ((Element) nodes.get(i)).
                            getElementsByClass("_4K6U+ _9dcVo").get(0).
                            childNodes().get(0));
                    System.out.println(((Element) nodes.get(i)).getElementsByClass("vpvdP _9TfK4").get(0).childNodes().get(0));
                    System.out.println("Предсказание: " + ((Element) nodes.get(i)).getElementsByClass("BDPZt KUbeq").get(0).childNodes().get(0).childNodes().get(0) + "\n");
                    bufWriter.write(String.valueOf("Знак зодиака: " + ((Element) nodes.get(i)).
                            getElementsByClass("_4K6U+ _9dcVo").get(0).
                            childNodes().get(0)) + "\n");
                    bufWriter.write(String.valueOf(((Element) nodes.get(i)).getElementsByClass("vpvdP _9TfK4").get(0).childNodes().get(0)) + "\n");
                    bufWriter.write(String.valueOf("Предсказание: " + ((Element) nodes.get(i)).getElementsByClass("BDPZt KUbeq").get(0).childNodes().get(0).childNodes().get(0) + "\n\n"));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }catch (IOException e){
            System.out.println("Ошибка - " + e);
        } finally {
            bufWriter.flush();
            bufWriter.close();
        }

    }

    public static String SetNewFile(String path) {
        try {
            File fileOne = new File(path);

            fileOne.createNewFile();
            System.out.println("Создан файл по пути: " + fileOne.getAbsolutePath());
            return fileOne.getAbsolutePath();

        }catch (IOException e){
            System.out.println("Ошибка создания файла - " + e);
        }
        finally {
            return path;
        }

    }

    public static Document connectToURL(String url){
        Document doc = null;
        try {
            doc = Jsoup.connect(url).get();
            return doc;
        }catch (IOException e){
            System.out.print("Ошибка подключения к сайту, попытка подключиться ещё раз\n");
            connectToURL(url,1);
        }finally {
            return doc;
        }
    }

    public static Document connectToURL(String url, int countReplay){
        Document doc = null;
        countReplay++;
        if(countReplay>=3){
            return doc;
        }else {
            try {
                doc = Jsoup.connect(url).get();
                return doc;
            } catch (IOException e) {
                System.out.print("Ошибка подключения к сайту, попытка подключиться ещё раз\n");
                connectToURL(url,countReplay);
            } finally {
                return doc;
            }
        }
    }
}
