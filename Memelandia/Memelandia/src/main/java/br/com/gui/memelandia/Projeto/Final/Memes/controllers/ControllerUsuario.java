package br.com.gui.memelandia.Projeto.Final.Memes.controllers;

import br.com.gui.memelandia.Projeto.Final.Memes.dto.NovoUsuarioDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "usuarios")
public class ControllerUsuario {
    @Autowired
    private ServicoNovoUsuario servicoNovoUsuario;

    @GetMapping
    public Iterable<NovoUsuarioDTO> encontrarTodos(){
        return servicoNovoUsuario.encontrarTodos();
    }

    @PostMapping
    public NovoUsuarioDTO criarUsuario(@RequestBody NovoUsuarioDTO usuario){

        return servicoNovoUsuario.criarNovoUsuario(usuario);
    }
}
