package br.com.gui.users.Projeto.Final.Memes.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.util.Date;
import java.util.UUID;

@Entity
public class Usuario {
    @Id
    @Column(name = "id", nullable = false)
    private String id;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    @Email
    private String email;

    @Column(name = "data_cadastro", nullable = false)
    private Date dataCadastro;

    @Max(value = 200)
    @Min(value = 0)
    private Long idade;

    public Usuario() {}

    public Usuario(String id, String nome, String email, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataCadastro = dataCadastro;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Long getIdade() {
        return idade;
    }

    public void setIdade(Long idade) {
        this.idade = idade;
    }

    @PrePersist
    public void createId(){
        this.id = UUID.randomUUID().toString();
    }
}
