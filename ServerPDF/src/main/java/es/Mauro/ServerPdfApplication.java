package es.Mauro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerPDFApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerPDFApplication.class, args);
		ServidorPDF x=new ServidorPDF();
		x.iniciar();
	}
}
