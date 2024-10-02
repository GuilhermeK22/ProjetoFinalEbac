package br.com.gui.memelandia.Projeto.Final.Memes.repositories;

import br.com.gui.memelandia.Projeto.Final.Memes.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
}
