package br.com.gui.memelandia.Projeto.Final.Memes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/categoria")
public class ControllerCategMeme {

    @Autowired
    public ServicoNovoCategMeme servicoNovoCategoriaMeme;

    @GetMapping
    public Iterable<CategMemeDTO> buscaCategorias() {
        return servicoNovoCategoriaMeme.encontrarTodos();
    }

    @PostMapping
    public CategMemeDTO novaCategoria(@RequestBody CategMemeDTO categoriaMeme) {
        return servicoNovoCategoriaMeme.criarNovaCategoria(categoriaMeme);
    }
}
