package com.finplanner.finance_app_be.service;

import org.springframework.stereotype.Service;

@Service
public class AuthService {

    public String login(String username, String password) {
        // your existing dummy login
        return "dummy-jwt-token";
    }

    public void register(String username, String password) {
        // TODO: actually save the user to your DB.
        // For now, this is a no-op that always "succeeds".
    }
}
