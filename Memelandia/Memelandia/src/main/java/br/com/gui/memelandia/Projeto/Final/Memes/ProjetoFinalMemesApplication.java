package br.com.gui.memelandia.Projeto.Final.Memes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClientes(basePackages = "br.com.gui.memelandia.Projeto.Final.Memes.feign")
public class ProjetoFinalMemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFinalMemesApplication.class, args);
	}

}
