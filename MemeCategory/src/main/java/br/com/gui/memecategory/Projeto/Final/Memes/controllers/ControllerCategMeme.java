package br.com.gui.memecategory.Projeto.Final.Memes.controllers;

import br.com.gui.memecategory.Projeto.Final.Memes.entities.CategMeme;
import br.com.gui.memecategory.Projeto.Final.Memes.services.ServicoCategMeme;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/categoria")
public class ControllerCategMeme {
    @Autowired
    private ServicoCategMeme servicoCategoriaMeme;

    @PostMapping
    public CategMeme criarCategoriaMeme(@RequestBody CategMeme categoriaMeme){
        return servicoCategoriaMeme.criarCategMeme(categoriaMeme);
    }

    @GetMapping
    public Iterable<CategMeme> encontrarTodos(){
        return servicoCategoriaMeme.encontrarTodos();
    }
}
