package br.com.gui.memelandia.Projeto.Final.Memes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/memes")
public class ControllerMeme {

    @Autowired
    private ServicoMeme servicoMeme;

    @GetMapping
    public Iterable<MemeDTO> buscaMemes() {
        return servicoMeme.encontrarTodos();
    }

    @PostMapping
    public MemeDTO novoMeme(@RequestBody MemeDTO meme) {
        return servicoMeme.criarNovoMeme(meme);
    }
}
