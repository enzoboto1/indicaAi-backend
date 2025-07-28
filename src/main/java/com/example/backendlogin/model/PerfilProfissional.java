package com.example.backendlogin.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "perfis_profissionais")

public class PerfilProfissional {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "usuario_id")
    private User usuario;
    @Column(columnDefinition = "TEXT")
    private String bio;
    private String areaInteresse;
    private String disponibilidade;
    private String linkedinUrl;
    private String githubUrl;

    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Experiencia> experiencias = new ArrayList<>();

    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Projeto> projetos = new ArrayList<>();
}
