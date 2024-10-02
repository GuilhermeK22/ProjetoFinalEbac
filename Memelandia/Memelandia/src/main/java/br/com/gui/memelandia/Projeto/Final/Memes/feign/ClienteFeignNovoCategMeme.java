package br.com.gui.memelandia.Projeto.Final.Memes.feign;

import br.com.gui.memelandia.Projeto.Final.Memes.dto.CategMemeDTO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "cliente-novo-categoria-meme", url = "http://localhost:8081")
public interface ClienteFeignNovoCategMeme {
    @RequestMapping(method = RequestMethod.POST, path = "/categoria")
    public CategMemeDTO criarNovaCategMeme(@RequestBody CategMemeDTO categoriaMeme);

    @RequestMapping(method = RequestMethod.GET, path = "/categoria")
    public Iterable<CategMemeDTO> encontrarTodos();
}
