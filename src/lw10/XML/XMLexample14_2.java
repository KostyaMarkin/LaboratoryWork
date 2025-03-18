package lw10.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;


public class XMLexample14_2 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Поиск книги по названию. Введите название книги: ");
            String nameBookSearch = in.nextLine();
            File inputFile = new File("src/lw10/test/XML/example.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputFile);
            doc.getDocumentElement().normalize();
            NodeList nodeList = doc.getElementsByTagName("book");
            Stream<Node> nodeStream = IntStream.range(0, nodeList.getLength()).mapToObj(nodeList::item);
            List<Element> list = nodeStream.filter(node -> node.getNodeType() == Node.ELEMENT_NODE)
                    .map(node -> (Element) node)
                    .filter(element -> {
                        String author = element.getElementsByTagName("title").item(0).getTextContent();
                        return author.equalsIgnoreCase(nameBookSearch);
                    })
                    .collect(Collectors.toList());
            for(Node node : list){
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("Название книги: " + element.getElementsByTagName("title").item(0).getTextContent());
                    System.out.println("Автор: " + element.getElementsByTagName("author").item(0).getTextContent());
                    System.out.println("Год издания: " + element.getElementsByTagName("year").item(0).getTextContent());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
