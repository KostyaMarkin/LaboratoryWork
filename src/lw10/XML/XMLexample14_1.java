package lw10.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;
import java.util.Scanner;

public class XMLexample14_1 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Сколько элементов вы хотите добавить?");
            int countAddItem = in.nextInt();
            File inputFile = new File("src/lw10/test/XML/example.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(inputFile);
            doc.getDocumentElement().normalize();
            for(int i = 0; i < countAddItem; i++){
                System.out.print("Название книги: ");
                String nameBook = in.next();
                Element bookOne = doc.createElement("book");
                doc.getDocumentElement().appendChild(bookOne);
                Element title = doc.createElement("title");
                title.appendChild(doc.createTextNode(nameBook));
                bookOne.appendChild(title);
                System.out.print("Автор: ");
                String author = in.next();
                Element authorOne = doc.createElement("author");
                authorOne.appendChild(doc.createTextNode(author));
                bookOne.appendChild(authorOne);
                System.out.print("Год издания: ");
                String year = in.next();
                Element yearOne = doc.createElement("year");
                yearOne.appendChild(doc.createTextNode(year));
                bookOne.appendChild(yearOne);
            }
            doc.setXmlStandalone(true);
            doc.normalizeDocument();
            javax.xml.transform.TransformerFactory tf = javax.xml.transform.TransformerFactory.newInstance();
            javax.xml.transform.Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            javax.xml.transform.dom.DOMSource source = new javax.xml.transform.dom.DOMSource(doc);
            javax.xml.transform.stream.StreamResult result = new javax.xml.transform.stream.StreamResult(new File("src/lw10/test/XML/example.xml"));
            transformer.transform(source, result);
            System.out.print("Корневой элемент " + doc.getDocumentElement().getNodeName());
            NodeList nodeList = doc.getElementsByTagName("book");
            for (int i = 0; i < nodeList.getLength(); i++) {
                Node node = nodeList.item(i);
                System.out.println("\nТекущий элемент: " + node.getNodeName());
                if (node.getNodeType() == Node.ELEMENT_NODE) {
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
