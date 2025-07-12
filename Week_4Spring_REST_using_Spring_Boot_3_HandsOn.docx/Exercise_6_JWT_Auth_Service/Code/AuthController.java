

package com.example.demo;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.HashMap;

@RestController
public class AuthController {

    private static final String SECRET = "secretsecretsecretsecretsecret12"; // 32+ characters

    @PostMapping("/auth")
    public Map<String, String> authenticate(@RequestBody Map<String, String> request) {
        String token = Jwts.builder()
                .setSubject(request.get("user"))
                .signWith(Keys.hmacShaKeyFor(SECRET.getBytes()))
                .compact();

        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
