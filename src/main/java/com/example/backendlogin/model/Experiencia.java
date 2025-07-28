package com.example.backendlogin.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "experiencias")
public class Experiencia {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "perfil_id")
    private PerfilProfissional perfil;
    private String empresa;
    private String cargo;
    @Column(columnDefinition = "TEXT")
    private String descricao;
    private LocalDate inicio;
    private LocalDate fim;


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

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getInicio() {
        return inicio;
    }

    public void setInicio(LocalDate inicio) {
        this.inicio = inicio;
    }

    public LocalDate getFim() {
        return fim;
    }

    public void setFim(LocalDate fim) {
        this.fim = fim;
    }
}
