package lw10.test.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.*;
import java.util.List;
import java.util.Random;

public class NewParser {
    public static void main(String[] args) throws IOException {
        try {
            Document doc = Jsoup.connect("https://www.e1.ru/horoscope/daily/").get();
            Elements newParent = doc.select("#app > div.global-wrapper > div.app-content > div > div.inner-columns-wrapper > div.central-right-wrapper > div.central-column-container > section");
            List<Node> nodes = newParent.get(0).childNodes();
            for (int i = 2; i < nodes.size(); i++) {
                System.out.println("Знак зодиака: " + ((Element) nodes.get(i)).
                        getElementsByClass("_4K6U+ _9dcVo").get(0).
                        childNodes().get(0));
                System.out.println(((Element) nodes.get(i)).getElementsByClass("vpvdP _9TfK4").get(0).childNodes().get(0));
                System.out.println("Предсказание: " + ((Element) nodes.get(i)).getElementsByClass("BDPZt KUbeq").get(0).childNodes().get(0).childNodes().get(0) + "\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
