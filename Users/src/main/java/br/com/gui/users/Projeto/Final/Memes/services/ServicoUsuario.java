package br.com.gui.users.Projeto.Final.Memes.services;

import br.com.gui.users.Projeto.Final.Memes.entities.Usuario;
import br.com.gui.users.Projeto.Final.Memes.repositories.RepositorioUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ServicoUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoUsuario.class);

    public Iterable<Usuario> encontrarTodos(){
        LOGGER.info("Retornando "+  repositorioUsuario.count() + " Memes");
        return repositorioUsuario.findAll();
    }

    public Usuario criarUsuario(Usuario usuario){
        LOGGER.info("Criando usuário " + usuario.getNome());
        return repositorioUsuario.save(usuario);

    }

    public Optional<Usuario> encontrarUsuarioAleatorio(){
        LOGGER.info("Retornando Usuario Aleatório");
        return repositorioUsuario.findRandomUser();
    }
}
