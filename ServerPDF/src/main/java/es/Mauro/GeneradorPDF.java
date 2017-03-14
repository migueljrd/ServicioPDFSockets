package es.Mauro;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
public class GeneradorPDF {
	public void GenerarPDF(String pedido) throws FileNotFoundException, DocumentException {
		FileOutputStream archivo = new FileOutputStream("C:/Users/miguel/Desktop/pedido.pdf");
		Document documento = new Document();
		PdfWriter.getInstance(documento, archivo);
		documento.open();
		documento.add(new Paragraph(pedido));
		documento.close();
	}
}
