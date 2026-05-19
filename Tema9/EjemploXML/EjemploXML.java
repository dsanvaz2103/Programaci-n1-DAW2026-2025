package Tema9.EjemploXML;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class EjemploXML {
    static void main() {
        // Parsear: XML --> DOM
        try {
            File file = new File("ejemplo.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(file);
            System.out.println("Documento parseado!");

            NodeList elementos = document.getChildNodes();
            for (int i = 0; i < elementos.getLength(); i++) {
                if (elementos.item(i).getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(elementos.item(i).getTextContent());
                }
            }

        } catch (SAXException | IOException | ParserConfigurationException e) {
            e.printStackTrace();
        }

    }
}
