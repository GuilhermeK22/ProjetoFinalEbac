package br.com.gui.memelandia.Projeto.Final.Memes.repositories;

import br.com.gui.memelandia.Projeto.Final.Memes.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioMeme extends JpaRepository<Meme, Long> {
}
