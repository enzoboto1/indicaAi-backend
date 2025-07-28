package com.example.backendlogin.service;

import com.example.backendlogin.model.User;
import com.example.backendlogin.repository.UserRepository;
import jakarta.persistence.EntityNotFoundException;

public class UserService {
    private final UserRepository usuarioRepo;

    public UserService(UserRepository usuarioRepo) {
        this.usuarioRepo = usuarioRepo;
    }

    public User criar(User dto) {
        User u = new User();
        u = usuarioRepo.save(u);
        return u;
    }

    public User buscarPorId(Long id) {
        User u = usuarioRepo.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Usuário não encontrado"));
        return u;
    }

    private String hash(String senha) {
        // implementar BCrypt ou similar
        return senha; // placeholder
    }
}
