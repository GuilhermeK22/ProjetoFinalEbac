package br.com.gui.memelandia.Projeto.Final.Memes.services;

import br.com.gui.memelandia.Projeto.Final.Memes.dto.MemeDTO;
import br.com.gui.memelandia.Projeto.Final.Memes.feign.ClienteFeignMeme;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ServicoMeme {
    private ClienteFeignMeme clienteFeignMeme;

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ServicoMeme.class);

    public ServicoMeme(ClienteFeignMeme clienteFeignMeme) {
        this.clienteFeignMeme = clienteFeignMeme;
    }
    public MemeDTO criarNovoMeme(MemeDTO meme){
        LOGGER.info("Criando novo meme");
        return clienteFeignMeme.criarNovoMeme(meme);
    }
    public Iterable<MemeDTO> encontrarTodos() {
        LOGGER.info("Encontrar todos os memes");
        return clienteFeignMeme.encontrarTodos();
    }
}
