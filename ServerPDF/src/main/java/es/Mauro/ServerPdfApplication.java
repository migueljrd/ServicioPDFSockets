package es.Mauro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServerPdfApplication {
	public static void main(String[] args) {
		SpringApplication.run(ServerPdfApplication.class, args);
		Servidor x=new Servidor();
		x.iniciar();
	}
}