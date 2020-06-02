package com.example.loginpoc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginpoc.entity.Response;
import com.example.loginpoc.entity.User;
import com.example.loginpoc.entity.UserList;
import com.example.loginpoc.service.LoginService;

@RestController
@RequestMapping("/api")
public class LoginController {

	@Autowired
	LoginService loginService;

	@PostMapping("/register")
	public ResponseEntity<Response<?>> saveUser(@RequestBody User user) {
		return new ResponseEntity<Response<?>>(loginService.saveUser(user), HttpStatus.OK);

	}

	@PostMapping("/login")
	public ResponseEntity<Response<?>> authentication(@RequestBody User user) throws Exception {
		return new ResponseEntity<Response<?>>(loginService.checkUser(user), HttpStatus.OK);

	}
	
	@GetMapping("/allUsers")
	public UserList getAllUsers(){
	
		return 	loginService.getAllUsers();
	}
	
	
	
	
	
	
	
}