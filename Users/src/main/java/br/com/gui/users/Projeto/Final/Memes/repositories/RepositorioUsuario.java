package br.com.gui.users.Projeto.Final.Memes.repositories;

import br.com.gui.users.Projeto.Final.Memes.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface RepositorioUsuario extends JpaRepository<Usuario, String> {
    @Query(value = "SELECT * FROM usuario ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Optional<Usuario> findRandomUser();
}
