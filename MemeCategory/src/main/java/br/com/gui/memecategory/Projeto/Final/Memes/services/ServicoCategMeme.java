package br.com.gui.memecategory.Projeto.Final.Memes.services;

import br.com.gui.memecategory.Projeto.Final.Memes.entities.CategMeme;
import br.com.gui.memecategory.Projeto.Final.Memes.repositories.RepositorioCategMeme;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class ServicoCategMeme {

    @Autowired
    private RepositorioCategMeme repositorioCategMeme;

    private static final Logger LOGGER = (Logger) LoggerFactory.getLogger(ServicoCategMeme.class);

    public Iterable<CategMeme> encontrarTodos(){
        LOGGER.info("Retornando "+  repositorioCategMeme.count() + " Memes");
        return repositorioCategMeme.findAll();
    }

    public CategMeme criarCategoriaMeme(CategMeme categoriaMeme){
        LOGGER.info("Criando Categoria " + categoriaMeme.getNome());
        return repositorioCategMeme.save(categoriaMeme);
    }

    public CategMeme criarCategMeme(CategMeme categoriaMeme) {

        return categoriaMeme;
    }
}
