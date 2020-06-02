package com.example.loginpoc.service;





import com.example.loginpoc.entity.Response;
import com.example.loginpoc.entity.User;
import com.example.loginpoc.entity.UserList;

public interface LoginService {

	public Response<?> saveUser(User user);
	Response<?> checkUser(User user);
	UserList getAllUsers();
}
