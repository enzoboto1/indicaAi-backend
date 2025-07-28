package com.example.backendlogin.model;

import com.example.backendlogin.enums.StatusConexao;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "conexoes", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"usuario_id_1","usuario_id_2"})
})

public class Conexao {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "usuario_id_1")
    private User usuario1;
    @ManyToOne @JoinColumn(name = "usuario_id_2")
    private User usuario2;
    @Enumerated(EnumType.STRING)
    private StatusConexao status;
    private LocalDateTime dataConexao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUsuario1() {
        return usuario1;
    }

    public void setUsuario1(User usuario1) {
        this.usuario1 = usuario1;
    }

    public User getUsuario2() {
        return usuario2;
    }

    public void setUsuario2(User usuario2) {
        this.usuario2 = usuario2;
    }

    public StatusConexao getStatus() {
        return status;
    }

    public void setStatus(StatusConexao status) {
        this.status = status;
    }

    public LocalDateTime getDataConexao() {
        return dataConexao;
    }

    public void setDataConexao(LocalDateTime dataConexao) {
        this.dataConexao = dataConexao;
    }
}


