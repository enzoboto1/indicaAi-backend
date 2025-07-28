package com.example.backendlogin.controller;

import com.example.backendlogin.dto.LoginRequest;
import com.example.backendlogin.service.AuthService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request) {
        boolean isAuthenticated = authService.authenticate(request.getUsername(), request.getPassword());
        return isAuthenticated ? "Login bem-sucedido" : "Usuário ou senha inválidos";
    }
}
