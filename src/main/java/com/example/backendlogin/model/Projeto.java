package com.example.backendlogin.model;

import jakarta.persistence.*;

@Entity
@Table(name = "projetos")
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "perfil_id", nullable = false)
    private PerfilProfissional perfil;

    private String titulo;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    private String link;

    public Projeto() {}

    public Projeto(Long id, PerfilProfissional perfil, String titulo, String descricao, String link) {
        this.id = id;
        this.perfil = perfil;
        this.titulo = titulo;
        this.descricao = descricao;
        this.link = link;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PerfilProfissional getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilProfissional perfil) {
        this.perfil = perfil;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
