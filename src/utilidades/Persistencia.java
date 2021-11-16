package utilidades;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import projetoPrincipal.centralDeInformacoes;

public class Persistencia {
	
	private XStream xstream = new XStream(new DomDriver());
	private File arquivo = new File ("per.xml");
	

	public void salvarCentral (centralDeInformacoes c) {
		
		 String xml = xstream.toXML(c);
			try {				
				arquivo.createNewFile();
				PrintWriter gravar = new PrintWriter(arquivo);
				gravar.print(xml);
				gravar.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
	}
	public centralDeInformacoes recuperarCentral () {
			 try {
				 FileInputStream fis = new FileInputStream(arquivo);
				 return (centralDeInformacoes) xstream.fromXML(fis);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		 return new centralDeInformacoes ();
	}
}