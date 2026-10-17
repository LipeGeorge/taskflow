package com.taskflow.TaskFlow.service;

import com.taskflow.TaskFlow.controller.dto.LoginRequest;
import com.taskflow.TaskFlow.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	private final PasswordEncoder passwordEncoder;

	public UserService(PasswordEncoder passwordEncoder) {
		this.passwordEncoder = passwordEncoder;
	}

	public boolean isLoginCorrect(User user, LoginRequest loginRequest) {
		return passwordEncoder.matches(loginRequest.password(), user.getPassword());
	}
}
