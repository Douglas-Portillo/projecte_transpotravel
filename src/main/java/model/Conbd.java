package model;

import java.sql.*;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class Conbd {
	
	private Connection con;
	private String enllaç;
	private String usuari;
	private String contraseña;
	
	
	public Conbd() {
		
		try {
			
			// Declarem e Inicialitzem una nova instancia
			DocumentBuilderFactory factory  = DocumentBuilderFactory.newInstance();

			// Declarem e Inicialitzem un nou DocumentBuilder amb la instancia de factory
			DocumentBuilder builder = factory.newDocumentBuilder();
									
			// Obtenim l'archiu
			Document document = builder.parse(new File("C:\\Users\\Douglas\\eclipse-workspace\\practica\\src\\test\\java\\model\\prova.xml"));

			// Obtenim l'arrel
			Element root = document.getDocumentElement();
			
									
			// Obtenim les etiquetes filles (IDs, noms, paisos)
			NodeList list = root.getElementsByTagName("con");
									
			for (int i = 0; i < list.getLength(); i++) {
				
			    Element lan =  (Element) list.item(i);
			    
				NodeList clist = lan.getChildNodes();
				
				for (int j = 0; j < clist.getLength(); j++) {
					
					Node c = clist.item(j);
					
					if (c instanceof Element) {
						if(c.getNodeName() == "usuari") {
									usuari = c.getTextContent();
						}
						
						if(c.getNodeName() == "contraseña") {
							contraseña = c.getTextContent();
						}
						
						if(c.getNodeName() == "enllaç") {
							enllaç = c.getTextContent();
						}
						
					}
				}
				
			//Connectar a la BD
			this.con = DriverManager.getConnection(enllaç,usuari,contraseña);
			
			
						}} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public Connection getCon() {
		return con;
	}
	
}
