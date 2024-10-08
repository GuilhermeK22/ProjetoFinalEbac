package br.com.gui.memelandia.Projeto.Final.Memes.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class Meme {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequence_meme")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "data_cadastro", nullable = false)
    private Date dataCadastro;

    @ManyToOne
    @JoinColumn(name = "categoria_meme_id")
    private CategMeme categMeme;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    private String idNovoUsuario;

    private String idNovoCategoriaMeme;

    public Meme() {}

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CategMeme getCategoriaMeme() {
        return categMeme;
    }

    public void setCategoriaMeme(CategMeme categoriaMeme) {
        this.categMeme = categoriaMeme;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getIdNovoUsuario() {
        return idNovoUsuario;
    }

    public void setIdNovoUsuario(String idNovoUsuario) {
        this.idNovoUsuario = idNovoUsuario;
    }
}
