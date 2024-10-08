package br.com.gui.memelandia.Projeto.Final.Memes.dto;

import java.io.Serializable;
import java.util.Date;

public class CategMemeDTO implements Serializable {

    private final String id;

    private final String nome;

    private final String descricao;


    private final Date dataCadastro;


    private final String idUsuario;

    public CategMemeDTO(String id, String nome, String descricao, Date dataCadastro, String idUsuario) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataCadastro = dataCadastro;
        this.idUsuario = idUsuario;
    }
    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public String getIdUsuario() {
        return idUsuario;
    }
}
