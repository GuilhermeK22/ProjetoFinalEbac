package br.com.gui.memelandia.Projeto.Final.Memes.services;

import br.com.gui.memelandia.Projeto.Final.Memes.dto.CategMemeDTO;
import br.com.gui.memelandia.Projeto.Final.Memes.feign.ClienteFeignNovoCategMeme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ServicoNovoCategMeme {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicoNovoCategMeme.class);

    private final ClienteFeignNovoCategMeme clienteFeignNovoCategoriaMeme;

    public ServicoNovoCategMeme(ClienteFeignNovoCategMeme clienteFeignNovoCategMeme) {
        this.clienteFeignNovoCategoriaMeme = clienteFeignNovoCategMeme;
    }

    public CategMemeDTO criarNovaCategoria(CategMemeDTO categoriaMemeDTO) {
        LOGGER.info("Criando nova Categoria Meme");
        return clienteFeignNovoCategoriaMeme.criarNovaCategMeme(categoriaMemeDTO);
    }

    public Iterable<CategMemeDTO> encontrarTodos() {
        LOGGER.info("Encontrar todas categorias");
        return clienteFeignNovoCategoriaMeme.encontrarTodos();
    }
}
