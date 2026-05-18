package Tema9.Ejercicio15;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;

public class LectorConfiguracion {
    public static void main(String[] args) {
        try {
            // 1. Crear la factoría y el constructor de documentos
            DocumentBuilderFactory fabrica = DocumentBuilderFactory.newInstance();
            DocumentBuilder constructor = fabrica.newDocumentBuilder();

            // 2. BUSCAR EL ARCHIVO EN LA MISMA CARPETA QUE ESTA CLASE
            // Al poner "config.xml" sin barras, busca exactamente en el mismo paquete/directorio de la clase
            InputStream flujoXml = LectorConfiguracion.class.getResourceAsStream("config.xml");

            // Controlamos si no encuentra el archivo para dar un mensaje claro
            if (flujoXml == null) {
                System.err.println("Error: No se encontró 'config.xml' en la misma carpeta que LectorConfiguracion.");
                return;
            }

            // Parsear el flujo del archivo XML
            Document documento = constructor.parse(flujoXml);

            // Opcional pero recomendado: Normaliza el árbol XML
            documento.getDocumentElement().normalize();

            // 3. Obtener el elemento raíz (<configuracion>)
            Element raiz = documento.getDocumentElement();
            System.out.println("Elemento raíz: " + raiz.getNodeName());

            // 4. Obtener los hijos de <base-datos>
            NodeList listaBaseDatos = documento.getElementsByTagName("base-datos");
            Node nodoBaseDatos = listaBaseDatos.item(0);

            // Mostrar el atributo motor
            if (nodoBaseDatos.getNodeType() == Node.ELEMENT_NODE) {
                Element elementoBd = (Element) nodoBaseDatos;
                System.out.println("Motor de BD: " + elementoBd.getAttribute("motor"));
            }

            // 5. Obtener sus hijos directos
            NodeList hijos = nodoBaseDatos.getChildNodes();
            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());

            System.out.println("--- Listando hijos (Sin filtrar) ---");
            for (int i = 0; i < hijos.getLength(); i++) {
                Node hijo = hijos.item(i);
                System.out.println("Hijo " + i + " -> Tipo: " + hijo.getNodeType() + " | Nombre: " + hijo.getNodeName());
            }

            // Filtrado de datos reales
            System.out.println("\n--- Valores Reales Filtrados (Solo Elementos) ---");
            for (int i = 0; i < hijos.getLength(); i++) {
                Node hijo = hijos.item(i);
                if (hijo.getNodeType() == Node.ELEMENT_NODE) {
                    System.out.println(hijo.getNodeName() + ": " + hijo.getTextContent());
                }
            }

            // Cerramos el flujo de datos al terminar
            flujoXml.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    /*
        Reflexión: ¿Cuántos hijos hay y por qué? ¿Cuáles son los verdaderos elementos?
        Al ejecutar el código anterior, verás que la salida indica que hay 7 hijos, estructurados de la siguiente forma:

        ¿Por qué salen 7 en vez de 3?
        Porque en el árbol DOM, los saltos de línea y los espacios de tabulación (la indentación) que usamos en el fichero de texto para que el XML sea legible se procesan como nodos de tipo

        ¿Cuáles son los verdaderos elementos?
        Los verdaderos elementos (las etiquetas XML) son aquellos cuyo tipo de nodo es 1 (Node.ELEMENT_NODE). En este caso son únicamente tres: <host>, <puerto> y <usuario>.
    */
