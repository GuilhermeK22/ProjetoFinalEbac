package br.com.gui.users.Projeto.Final.Memes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("br.com.gui.users.Projeto.Final.Memes.repositories")
public class ProjetoFinalMemesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoFinalMemesApplication.class, args);
	}

}
