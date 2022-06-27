package ejercicio.adicional.semana13;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

import ar.com.educacionit.domain.Articulos;


public class ClienteMain {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		PDDocument document = new PDDocument();
		PDPage firstPage = new PDPage();
		document.addPage(firstPage);
		
		document.save("C:\\mypdf.pdf");
		document.close();
		
		String path = "./src/test/java/ejercicio/adicional/semana13/articulos.xlsx";
		
		IParser<Collection<Articulos>> xlsxParser = new XLSXFileParser(path); 

		

		try {
			Collection<Articulos> articulos = xlsxParser.parse();			
			//System.out.println(articulos.size() == 1);
			System.out.println(articulos);
		} catch (ParseException e) {
			System.err.println(e);
		}
	}
	
}
