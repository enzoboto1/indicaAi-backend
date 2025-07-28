package com.example.backendlogin.controller;

import com.example.backendlogin.model.User;
import com.example.backendlogin.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuarios")
public class UsarioController {

    private final UserService usuarioService;

    public UsarioController() {
        usuarioService = new UserService(null);
    }

    @PostMapping
    public ResponseEntity<User> criar(@RequestBody User dto) {
        User resp = usuarioService.criar(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(resp);
    }

    @GetMapping("/{id}")
    public User buscar(@PathVariable Long id) {
        return usuarioService.buscarPorId(id);
    }
}
