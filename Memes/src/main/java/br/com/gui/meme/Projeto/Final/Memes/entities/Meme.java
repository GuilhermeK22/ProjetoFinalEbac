package br.com.gui.meme.Projeto.Final.Memes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

@Entity
public class Meme {

    @Id
    private String id;

    @NotBlank
    private String nome;

    @NotBlank
    private String descricao;

    @DateTimeFormat(pattern = "dd-MMM-yyyy")
    private Date dataCadastro;

    @URL
    private String url;

    @NotBlank
    private String categMemeId;

    @NotBlank
    private String usuarioId;

    public Meme() {
    }

    public Meme(String id, String nome, String descricao, Date dataCadastro, String url, String categoriaMemeId, String usuarioId) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.categMemeId = categoriaMemeId;
        this.usuarioId = usuarioId;
        this.url = url;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCategMemeId() {
        return categMemeId;
    }

    public void setCategMemeId(String categMemeId) {
        this.categMemeId = categMemeId;
    }

    public String getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(String usuarioId) {
        this.usuarioId = usuarioId;
    }

    @PrePersist
    public void createId(){
        this.id = UUID.randomUUID().toString();
    }
}
