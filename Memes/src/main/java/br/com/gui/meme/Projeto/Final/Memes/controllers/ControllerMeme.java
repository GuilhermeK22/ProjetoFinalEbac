package br.com.gui.meme.Projeto.Final.Memes.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/memes")
public class ControllerMeme {
    @Autowired
    private ServicoMeme servicoMeme;


    @PostMapping
    public Meme criarMeme(@RequestBody @Valid Meme meme) {
        return servicoMeme.criarMeme(meme);
    }

    @GetMapping
    public Iterable<Meme> encontrarTodos(){


        return servicoMeme.encontrarTodos();
    }

    @GetMapping(path = "/random")
    public Optional<Meme> encontrarMemeAleatorio(){
        return servicoMeme.encontrarMemeAleatorio();
    }
}
