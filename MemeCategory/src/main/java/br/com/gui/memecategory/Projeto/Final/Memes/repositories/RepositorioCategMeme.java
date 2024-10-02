package br.com.gui.memecategory.Projeto.Final.Memes.repositories;

import br.com.gui.memecategory.Projeto.Final.Memes.entities.CategMeme;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategMeme extends JpaRepository<CategMeme, String> {
}
