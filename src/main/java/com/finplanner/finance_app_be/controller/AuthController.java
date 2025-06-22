package com.finplanner.finance_app_be.controller;

import com.finplanner.finance_app_be.dto.AuthDTO;
import com.finplanner.finance_app_be.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    // your existing login
    @PostMapping("/login")
    public ResponseEntity<AuthDTO.LoginResponse> login(@RequestBody AuthDTO.LoginRequest req) {
        String token = authService.login(req.getUsername(), req.getPassword());
        return ResponseEntity.ok(new AuthDTO.LoginResponse(token));
    }

    // NEW: register endpoint
    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody AuthDTO.LoginRequest req) {
        authService.register(req.getUsername(), req.getPassword());
        // 201 Created with no body
        return ResponseEntity.status(201).build();
    }
}
