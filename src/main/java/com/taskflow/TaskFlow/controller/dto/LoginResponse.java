package com.taskflow.TaskFlow.controller.dto;

//ExpiresIn é uma conveção para o tempo que o token levará para expirar
public record LoginResponse(String accessToken, Long expiresIn) {
}
