package es.Mauro;
import java.io.*;
import java.net.*;
import java.util.*;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class Servidor {
	private ServerSocket sServidor;
	private Socket sCliente;
	private Scanner entrada;
	public void iniciar(){
		while(true){
		try{
			sServidor=new ServerSocket(9990);
			System.out.println(" - SERVIDOR INICIADO - ");
			System.out.println(" - Esperando Cliente - ");
			sCliente=sServidor.accept();
			entrada=new Scanner (sCliente.getInputStream());
		      FileOutputStream archivo = new FileOutputStream("C:/Users/miguel/Desktop/pedido.pdf");
		      Document documento = new Document();
		      PdfWriter.getInstance(documento, archivo);
		      documento.open();
		      do{
		    	  documento.add(new Paragraph(entrada.nextLine()));
		      }while(entrada.hasNextLine());
		      documento.close();
			finalizar();
		}
		catch(Exception e){
			e.printStackTrace();
			finalizar();
		}
		}
		}
	public void finalizar(){
		try{
			//salida.close();
			entrada.close();
			sCliente.close();
			sServidor.close();
			System.out.print("Conexion Finalizada!!");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}