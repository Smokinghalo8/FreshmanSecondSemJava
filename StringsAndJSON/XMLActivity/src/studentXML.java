
import javax.xml.parsers.*;
import java.util.*;
import java.io.*;
import java.lang.*;
import org.w3c.dom.*;


public class studentXML {
    public static void main(String[] args){
        try {
            File file = new File("Student_Record.xml");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(file);

            System.out.println("Root Node: "+doc.getDocumentElement().getNodeName());

            NodeList list = doc.getElementsByTagName("student");

            for(int i =0;i<list.getLength();i++){

                Node node = list.item(i);
                if(node.getNodeType() == Node.ELEMENT_NODE){
                    Element element = (Element) node;
                    System.out.println("ID: "+element.getAttribute("id"));
                    System.out.println("First Name: " + element
                            .getElementsByTagName("firstName")
                            .item(0)
                            .getTextContent()
                    );
                    System.out.println("Last Name: " + element
                            .getElementsByTagName("lastName")
                            .item(0)
                            .getTextContent()
                    );
                    System.out.println("Major: " + element
                            .getElementsByTagName("major")
                            .item(0)
                            .getTextContent()
                    );
                    System.out.println("GPA: " + element
                            .getElementsByTagName("gpa")
                            .item(0)
                            .getTextContent()
                    );
                }

            }
        } catch(Exception e){
            System.err.println("Exception Found :(");
            e.printStackTrace();
        }
    }


}
