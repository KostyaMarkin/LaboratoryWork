package lw10.XML;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import java.io.File;
import java.util.List;
import java.util.Scanner;
import java.util.stream.*;

public class XMLexample14_3 {
    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Удаление книги по названию. Введите название книги: ");
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
                    System.out.print("Удаление - " + element.getElementsByTagName("title").item(0).getTextContent());
                    Node parentNode = element.getParentNode();
                    parentNode.removeChild(element);
                }
            }
            nodeStream.close();
            int length = nodeList.getLength();
            DocumentBuilderFactory newFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder newBuilder = newFactory.newDocumentBuilder();
            Document newDoc = newBuilder.parse(inputFile);
            for(int i = 0; i < length ; i++){
                Node node = nodeList.item(i);
                Element bookOne = newDoc.createElement("book");
                newDoc.getDocumentElement().appendChild(bookOne);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    Element title = newDoc.createElement("title");
                    title.appendChild(newDoc.createTextNode(element.getElementsByTagName("title").item(0).getTextContent()));
                    bookOne.appendChild(title);
                    Element authorOne = newDoc.createElement("author");
                    authorOne.appendChild(newDoc.createTextNode(element.getElementsByTagName("author").item(0).getTextContent()));
                    bookOne.appendChild(authorOne);
                    Element yearOne = newDoc.createElement("year");
                    yearOne.appendChild(newDoc.createTextNode(element.getElementsByTagName("year").item(0).getTextContent()));
                    bookOne.appendChild(yearOne);
                }
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
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
