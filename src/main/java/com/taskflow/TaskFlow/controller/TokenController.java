package com.taskflow.TaskFlow.controller;

import com.taskflow.TaskFlow.controller.dto.LoginRequest;
import com.taskflow.TaskFlow.controller.dto.LoginResponse;
import com.taskflow.TaskFlow.repository.UserRepository;
import com.taskflow.TaskFlow.service.UserService;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.oauth2.jwt.JwtClaimsSet;
import org.springframework.security.oauth2.jwt.JwtEncoder;
import org.springframework.security.oauth2.jwt.JwtEncoderParameters;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;

@RestController
public class TokenController {

    private final JwtEncoder jwtEncoder;
    private final UserRepository userRepository;
    private final UserService userService;

    public TokenController(JwtEncoder jwtEncoder, UserRepository userRepository, UserService userService) {
        this.jwtEncoder = jwtEncoder;
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){

        var user = userRepository.findByEmail(loginRequest.email());

        if(user.isEmpty() || !userService.isLoginCorrect(user.get(), loginRequest)){
            throw new BadCredentialsException("user or password is invalid");
        }

        var now = Instant.now();
        var expiresIn = 300L;

        var claims = JwtClaimsSet.builder()
                .issuer("mybackend") // Quem está gerando o token (pode ser qualquer nome)
                .subject(user.get().getUserId().toString()) // Qual é o usuário
                .issuedAt(now) // Data de emissão do token
                .expiresAt(now.plusSeconds(expiresIn)) // Definindo tempo de expiração
                .build();

        // Pegando o token jwt utilizando os claims de cima.
        var jwtValue = jwtEncoder.encode(JwtEncoderParameters.from(claims)).getTokenValue();

        return ResponseEntity.ok(new LoginResponse(jwtValue, expiresIn));
    }
}
