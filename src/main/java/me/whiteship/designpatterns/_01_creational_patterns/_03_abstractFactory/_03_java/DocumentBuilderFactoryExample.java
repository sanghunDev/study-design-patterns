package me.whiteship.designpatterns._01_creational_patterns._03_abstractFactory._03_java;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class DocumentBuilderFactoryExample {

    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        //추상 팩토리 패턴 (팩토리를 통해서 추상적인 메소드를 통해 작업이 가능)
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File("src/main/resources/config.xml"));
        System.out.println("document = " + document.getDocumentElement());
    }
}
