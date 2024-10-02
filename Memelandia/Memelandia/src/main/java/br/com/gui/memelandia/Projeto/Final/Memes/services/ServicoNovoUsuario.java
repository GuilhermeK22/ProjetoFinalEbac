package br.com.gui.memelandia.Projeto.Final.Memes.services;

import br.com.gui.memelandia.Projeto.Final.Memes.dto.NovoUsuarioDTO;
import br.com.gui.memelandia.Projeto.Final.Memes.feign.ClienteFeignNovoUsuario;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServicoNovoUsuario {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoNovoUsuario.class);

    private final ClienteFeignNovoUsuario clienteFeignNovoUsuario;

    public ServicoNovoUsuario(ClienteFeignNovoUsuario clienteFeignNovoUsuario) {
        this.clienteFeignNovoUsuario = clienteFeignNovoUsuario;
    }

    public NovoUsuarioDTO criarNovoUsuario(NovoUsuarioDTO usuarioDTO) {
        LOGGER.info("Criando novo Usuário");
        return clienteFeignNovoUsuario.criarNovoUsuario(usuarioDTO);
    }

    public Iterable<NovoUsuarioDTO> encontrarTodos() {
        LOGGER.info("Retornando todos os usuários");
        return clienteFeignNovoUsuario.encontrarTodos();
    }
}
