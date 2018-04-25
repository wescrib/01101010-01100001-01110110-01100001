package com.scribner.parser;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class MyDOMParser {

	public static void main(String[] args) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("book.xml");
			NodeList bookList = doc.getElementsByTagName("book");
			for(int i=0; i<bookList.getLength(); i++) {
				Node b = bookList.item(i);
				if(b.getNodeType()==Node.ELEMENT_NODE) {
					Element book = (Element) b;
					String id = book.getAttribute("id");
					System.out.println("Book " + id + ":");
					NodeList titleList = book.getChildNodes();
					for(int j=0; j<titleList.getLength(); j++) {
						Node t = titleList.item(j);
						if(t.getNodeType()== Node.ELEMENT_NODE) {
							Element title = (Element) t;
							System.out.println("\t"+title.getTagName() + " = " + title.getTextContent());
						}
					}
				}
			}
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
