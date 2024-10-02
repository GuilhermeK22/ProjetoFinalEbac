package br.com.gui.meme.Projeto.Final.Memes.repositories;

import br.com.gui.meme.Projeto.Final.Memes.entities.Meme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RepositorioMeme extends JpaRepository<Meme, String> {
    @Query(value = "SELECT * FROM meme ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<Meme> findRandomMeme();
}
